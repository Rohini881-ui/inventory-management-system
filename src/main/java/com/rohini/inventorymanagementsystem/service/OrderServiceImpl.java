package com.rohini.inventorymanagementsystem.service;

import com.rohini.inventorymanagementsystem.entity.Order;
import com.rohini.inventorymanagementsystem.entity.Product;
import com.rohini.inventorymanagementsystem.repository.OrderRepository;
import com.rohini.inventorymanagementsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Order placeOrder(int productId, int quantity) {
        Product product = productRepository.findById(productId).orElseThrow();

        if (product.getQuantity() < quantity) {
            throw new RuntimeException("Not enough stock available");
        }

        product.setQuantity(product.getQuantity() - quantity);
        productRepository.save(product);

        Order order = new Order();
        order.setProduct(product);
        order.setQuantity(quantity);

        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}