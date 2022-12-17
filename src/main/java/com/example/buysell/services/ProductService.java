package com.example.buysell.services;

import com.example.buysell.models.Product;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private int  ID =0;
    {
        products.add(new Product
                (++ID,"Laptop",2345," black,small", 12.20, "Athens", "Tom" ));
        products.add(new Product
                (++ID,"Phone",2344,"white,slim",234.60,"Rome","Inna"));
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

