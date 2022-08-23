package org.example;

/**
 * bean对象
 *      用来接收配置文件中bean标签的id与class属性值
 */
public class MyBean {

    private String id; // bean对象的id属性值
    private String clazz; // bean对象的类路径

    public MyBean() {
    }

    public MyBean(String id, String clazz) {
        this.id = id;
        this.clazz = clazz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}