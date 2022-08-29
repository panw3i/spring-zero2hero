package org.example.controller;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BookControllerTest {
    @Test
    public void test() {
        // 得到Spring容器上下文环境
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        BookController bookController = (BookController)ac.getBean("bookController");
        System.out.println(bookController.getBookList());
    }
}