package org.example.controller;


import org.example.po.Book;
import org.example.service.BookService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BookController {

    @Resource
    BookService bookService;

    public List<Book> getBookList(){
        return bookService.getBookList();
    }
}
