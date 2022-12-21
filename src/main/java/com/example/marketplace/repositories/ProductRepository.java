package com.example.marketplace.repositories;

import com.example.marketplace.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public  interface ProductRepository extends JpaRepository<Product, Long> {

    /**
     * Find all products with a title that matches the given title.
     *
     * @param title The title of the product.
     * @return A list of products with the title specified.
     */
    List<Product> findByTitle(String title);
}
