package org.example.factory;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 模拟Spring的实现
 *  1、通过构造器得到相关配置文件
 *  2、通过dom4j解析xml文件，得到List   存放id和class
 *  3、通过反射实例化得到对象   Class.forName(类的全路径).newInstance(); 通过Map<id,Class>存储
 *  4、得到指定的实例化对象
 */
public class MyClassPathXmlApplicationContext implements MyFactory {

    private final HashMap<String,Object> beans = new HashMap<>(); // 实例化后的对象放入map
    private List<MyBean> myBeans; // 存放已读取bean 配置信息

    /* 1、通过构造器得到相关配置文件 */
    public MyClassPathXmlApplicationContext(String fileName) {

        /* 2、通过dom4j解析xml文件，得到List （存放id和class） */
        this.parseXml(fileName);

        /* 3、通过反射实例化得到对象Class.forName(类路径).newInstance();  通过Map存储 */
        this.instanceBean();

    }

    /**
     * 通过dom4j解析xml文件，得到List   存放id和class
     *  1、获取解析器
     *  2、得到配置文件的URL
     *  3、通过解析器解析xml文件（spring.xml）
     *  4、通过xpath语法，获取beans标签下的所有bean标签
     *  5、通过指定语法解析文档对象，返回集合
     *  6、判断集合是否为空，遍历集合
     *  7、获取标签元素中的属性
     *  8、得到Bean对象，将Bean对象设置到集合中
     */
    private void parseXml(String fileName) {
        // 1、获取解析器
        SAXReader reader = new SAXReader();
        // 2、得到配置文件的URL
        URL url = this.getClass().getClassLoader().getResource(fileName);
        try {
            // 3、通过解析器解析xml文件（spring.xml）
            Document document = reader.read(url);
            // 4、通过xpath语法，获取beans标签下的所有bean标签
            XPath xPath = document.createXPath("beans/bean");
            // 通过指定语法解析文档对象，返回集合
            List<Element> list =  xPath.selectNodes(document,xPath);
            // 判断集合是否为空，遍历集合
            if (list != null && list.size() > 0) {
                myBeans = new ArrayList<>();
                for(Element elment : list) {
                    // 获取标签元素中的属性
                    String id = elment.attributeValue("id"); // id 属性值
                    String clazz = elment.attributeValue("class"); // class 属性值
                    System.out.println(elment.attributeValue("id"));
                    System.out.println(elment.attributeValue("class"));
                    // 得到Bean对象
                    MyBean bean = new MyBean(id, clazz);
                    // 将Bean对象设置到集合容器中
                    myBeans.add(bean);
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过反射实例化得到对象
     * 	Class.forName(类的全路径).newInstance();
     *	通过Map<id,Class>存储
     */
    private void instanceBean() {
        // 判断bean集合是否为空，不为空遍历得到对应Bean对象
        if (myBeans != null && myBeans.size() > 0) {
            for (MyBean bean : myBeans){
                try {
                    // 通过Class.forName 类的全路径实例化对象
                    Object object = Class.forName(bean.getClazz()).newInstance();
                    // 将id与实例化对象设置到map对象中
                    beans.put(bean.getId(), object);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 通过key获取map中的指定value
     */
    @Override
    public Object getBean(String id) {
        return beans.get(id);
    }
}