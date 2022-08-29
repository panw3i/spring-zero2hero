package org.example.service;


import org.example.dao.BookDao;
import org.example.po.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;
    //get book list
    public List<Book> getBookList(){
       return  bookDao.queryBookList();
    }
}
