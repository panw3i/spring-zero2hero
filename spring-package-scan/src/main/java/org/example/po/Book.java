package org.example.po;

public class Book {
    // name
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;


    public Book(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
