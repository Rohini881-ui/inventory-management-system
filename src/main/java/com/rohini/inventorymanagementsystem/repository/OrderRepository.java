package com.rohini.inventorymanagementsystem.repository;

import com.rohini.inventorymanagementsystem.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}