package org.example.dao;


import org.example.po.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao {

    // query book
    public List<Book> queryBookList(){
        List<Book> bookList = new java.util.ArrayList<>();
        bookList.add(
                new Book("Spring in Action", 39.99)
        );
        return bookList;
    }
}
