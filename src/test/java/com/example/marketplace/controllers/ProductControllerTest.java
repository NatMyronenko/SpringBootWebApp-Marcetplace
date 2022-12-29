package com.example.marketplace.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void productsTest() throws Exception{
        mockMvc.perform(get(""))
                an


    }

    @Test
    void productInfo() {
    }

    @Test
    void createProduct() {
    }

    @Test
    void deleteProduct() {
    }

    @Test
    void userProducts() {
    }
}