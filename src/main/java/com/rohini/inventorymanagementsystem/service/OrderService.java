package com.rohini.inventorymanagementsystem.service;

import com.rohini.inventorymanagementsystem.entity.Order;
import java.util.List;

public interface OrderService {
    Order placeOrder(int productId, int quantity);
    List<Order> getAllOrders();
}