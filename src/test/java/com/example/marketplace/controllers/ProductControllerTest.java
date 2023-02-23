package com.example.marketplace.controllers;

import com.example.marketplace.models.Image;
import com.example.marketplace.models.Product;
import com.example.marketplace.models.User;
import com.example.marketplace.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.Model;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

class ProductControllerTest  {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
  ProductController productController;
    @Autowired
    ProductService productService;

 //   @Test
//    void productsTest() throws Exception{
//        mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("products"))
//                .andExpect(view().name("user"))
//                .andExpect(view().name("searchWord"));
//}
 @Test
 public void productsTest() {
     String title = "product title";
     Principal principal = mock(Principal.class);
     when(principal.getName()).thenReturn("user name");

     Model model = mock(Model.class);

     List<Product> products = Arrays.asList(new Product(), new Product());
     when(productService.listProducts(title)).thenReturn(products);
     User user = new User();
     when(productService.getUserByPrincipal(principal)).thenReturn(user);

     com.example.marketplace.repositories.ProductController controller = new com.example.marketplace.repositories.ProductController(productService);
     String result = controller.products(title, principal, model);

     verify(model).addAttribute("products", products);
     verify(model).addAttribute("user", user);
     verify(model).addAttribute("searchWord", title);
     assertEquals("products", result);
 }


    @Test
    void productInfoTest() {
        Long id = 1L;
        Principal principal = mock(Principal.class);
        when(principal.getName()).thenReturn("user name");

        Model model = mock(Model.class);

        Product product = new Product();
        List<Image> images = Arrays.asList(new Image(), new Image());
        product.setImages(images);
        User authorProduct = new User();
        product.setUser(authorProduct);
        when(productService.getProductById(id)).thenReturn(product);
        User user = new User();
        when(productService.getUserByPrincipal(principal)).thenReturn(user);

        com.example.marketplace.repositories.ProductController controller = new ProductController(productService);
        String result = controller.productInfo(id, model, principal);

        verify(model).addAttribute("user", user);
        verify(model).addAttribute("product", product);
        verify(model).addAttribute("images", images);
        verify(model).addAttribute("authorProduct", authorProduct);
        assertEquals("product-info", result);
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