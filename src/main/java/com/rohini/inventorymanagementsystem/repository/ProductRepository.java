package com.rohini.inventorymanagementsystem.repository;

import com.rohini.inventorymanagementsystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}