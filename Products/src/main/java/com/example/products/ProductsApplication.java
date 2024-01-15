package com.example.products;

import com.example.products.entities.Category;
import com.example.products.entities.Product;
import com.example.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {
    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProductsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.productRepository.save(new Product("test2",280 , true , Category.MEN_CLOTHES , "https://cdn.shopify.com/s/files/1/0070/7032/files/image5_4578a9e6-2eff-4a5a-8d8c-9292252ec848.jpg?v=1620247043"));
        this.productRepository.save(new Product("test3",290 , true , Category.WOMEN_CLOTHES , "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8cHJvZHVjdHN8ZW58MHx8MHx8fDA%3D"));
        this.productRepository.save(new Product("test4",300 , true , Category.MEN_CLOTHES , "https://images.unsplash.com/photo-1546868871-7041f2a55e12?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fHByb2R1Y3R8ZW58MHx8MHx8fDA%3D"));
        this.productRepository.save(new Product("test8",320 , false , Category.MEN_CLOTHES , "https://images.unsplash.com/photo-1602143407151-7111542de6e8?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
    }
}
