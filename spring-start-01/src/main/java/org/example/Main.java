package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 获取Spring上下文环境 (加载配置文件)
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        // 通过getBean方法得到Spring容器中实例化好的Bean对象 （实例化Bean对象）
        // userService代表的是配置文件中bean标签的id属性值
        UserService userService = (UserService) ac.getBean("userService");
        // 调用方法 （使用实例化对象）
        userService.test();
    }
}