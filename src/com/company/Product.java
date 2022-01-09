package com.company;

public class Product {
    private int id;
    private String name;
    private int price;
    private String descripition;

    public Product() {

    }

    public Product(int id, String name, int price, String descripition) {
        this.id = id;
        this.name=name;
        this.price = price;
        this.descripition = descripition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public String displayProduct() {
        return this.id + "\t" + this.name + "\t" + this.price + "\t" + this.descripition;
    }
}