/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.micro.services.demo.controller;

import com.naveed.micro.services.demo.entities.Order;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 21, 2020
 */
@RestController
public class OrderController {

    @Autowired
    private Environment environment;

    private final List<Order> orders = Arrays.asList(
            new Order(1, 1, "Product A"),
            new Order(2, 1, "Product B"),
            new Order(3, 2, "Product C"),
            new Order(4, 1, "Product D"),
            new Order(5, 2, "Product E"));

    @GetMapping
    public ResponseWrapper<List<Order>> getAllOrders(@RequestParam(required = false) Integer customerId) {
        if (customerId != null) {
            return new ResponseWrapper<>(
                    environment,
                    orders.stream()
                            .filter(order -> customerId.equals(order.getCustomerId()))
                            .collect(Collectors.toList()));
        }

        return new ResponseWrapper<>(environment, orders);
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orders.stream()
                .filter(order -> order.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
