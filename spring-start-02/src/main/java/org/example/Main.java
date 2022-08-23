package org.example;

import org.example.factory.MyClassPathXmlApplicationContext;
import org.example.factory.MyFactory;
import org.example.service.BookService;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyFactory factory = new MyClassPathXmlApplicationContext("spring.xml");
        BookService bookService = (BookService)factory.getBean("bookService");

        bookService.test();


    }
}