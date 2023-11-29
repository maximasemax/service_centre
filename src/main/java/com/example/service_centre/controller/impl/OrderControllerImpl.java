package com.example.service_centre.controller.impl;

import com.example.service_centre.controller.OrderController;
import com.example.service_centre.entity.Order;
import com.example.service_centre.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderControllerImpl implements OrderController {

    private final OrderService orderService;


    @GetMapping("/all")
    public String listOrders(@PathVariable Model model){
        model.addAttribute("orders",orderService.listAllOrder());
        return "orders";
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order order) {
        return orderService.updateOrder(id, order);
    }

    @GetMapping()
    public Order getOrder(@PathVariable Long id){
        return orderService.getOrder(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
}

