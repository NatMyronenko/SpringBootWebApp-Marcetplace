package com.example.marketplace.services;

import com.example.marketplace.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID =0;
    {
        products.add(new Product
                (++ID,"Laptop"," black,small", 12.20, "Athens", "Tom" ));
        products.add(new Product
                (++ID,"Phone","white,slim",234.60,"Rome","Inna"));
    }
    public List<Product> listProducts(){
        return products;
    }
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product-> product.getId()==(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId() == (id)) return product;
        }
        return null;
        }
    }

