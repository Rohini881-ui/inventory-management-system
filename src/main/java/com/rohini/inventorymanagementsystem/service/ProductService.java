package com.rohini.inventorymanagementsystem.service;

import com.rohini.inventorymanagementsystem.entity.Product;
import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
    Product updateProduct(int id, Product product);
    void deleteProduct(int id);
}