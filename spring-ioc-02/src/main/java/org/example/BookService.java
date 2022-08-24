package org.example;

public class BookService {

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    private String bookName;// 属性


    public  void  test(){
        System.out.println("UserService Test...");
    }

}