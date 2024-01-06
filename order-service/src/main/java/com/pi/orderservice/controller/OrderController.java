package com.pi.orderservice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi.orderservice.model.Order;
import com.pi.orderservice.repository.OrderRepository;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/order")
public class OrderController {
    private static final Logger LOGGER =  LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public Order add(@RequestBody Order order) {
        LOGGER.info("Order add: {}", order);
        return orderRepository.addOrder(order);
    }

    @GetMapping
    public List<Order> findAll() {
        LOGGER.info("Order find");
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id) {
        LOGGER.info("Order find: id={}", id);
        return orderRepository.findById(id);
    }
}