package com.example.service_centre.controller.impl;

import com.example.service_centre.controller.OrderController;
import com.example.service_centre.dto.OrderResponseDto;
import com.example.service_centre.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OrderControllerImpl implements OrderController {

    private final OrderService orderService;

    public OrderControllerImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public String getOrderList(Model model) {
        List<OrderResponseDto> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "orders";
    }

    @GetMapping("/orderManagement")
    public String showOrderManagementPage() {
        return "orderManagement";
    }

    @GetMapping("/search-order")
    public String getOrder(@RequestParam("id") Long id, Model model) {
        OrderResponseDto order = orderService.getOrder(id);
        model.addAttribute("order", order);
        return "orderDetails";
    }
    @GetMapping("/searchOrder")
    public String search() {
        return "searchOrder";
    }
}

