package com.example.products.entities;


import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private double price;
    private boolean disponibility;
    @Enumerated(EnumType.STRING)
    private Category category;
    private String imgUrl;
    private String description;
    private double rate = 0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDisponibility() {
        return disponibility;
    }

    public void setDisponibility(boolean disponibility) {
        this.disponibility = disponibility;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Product() {
    }

    public Product(Long id, String title, double price, boolean disponibility, Category category, String imgUrl) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.disponibility = disponibility;
        this.category = category;
        this.imgUrl = imgUrl;
    }

    public Product(String title, double price, boolean disponibility, Category category, String imgUrl) {
        this.title = title;
        this.price = price;
        this.disponibility = disponibility;
        this.category = category;
        this.imgUrl = imgUrl;
    }

    public Product(String title, double price, boolean disponibility, Category category, String imgUrl, String description) {
        this.title = title;
        this.price = price;
        this.disponibility = disponibility;
        this.category = category;
        this.imgUrl = imgUrl;
        this.description = description;
    }
}
