package org.example;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class BookService {
    BookDao bookDao;
    private String bookName;



    // 多个目录
    private List<String> categoriesList;

    public Map<String, String> getAuthorList() {
        return authorList;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Properties properties;



    public void setAuthorList(Map<String, String> authorList) {
        this.authorList = authorList;
    }

    private Map<String,String> authorList;
    public void setBookDao(BookDao bookDao){
        this.bookDao= bookDao;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        bookName = bookName;
    }

    public List<String> getCategories() {
        return categoriesList;
    }

    public void setCategories(List<String> categories) {
        categoriesList = categories;
    }
}
