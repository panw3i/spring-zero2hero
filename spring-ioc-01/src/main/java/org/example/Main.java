package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BookService service = (BookService)context.getBean("bookService");
        System.out.println(service.getCategories());
        System.out.println(service.getAuthorList());
        System.out.println(service.getProperties());
    }
}