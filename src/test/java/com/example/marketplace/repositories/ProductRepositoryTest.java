package com.example.marketplace.repositories;

import com.example.marketplace.models.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Test
    void findByTitleTest() {
        Product product = new Product();
        product.setTitle("Ipad");
        assertEquals("Ipad",product.getTitle());
    }
}