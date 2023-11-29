package com.example.service_centre.controller;

import com.example.service_centre.entity.Device;
import com.example.service_centre.entity.Order;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface OrderController {

    Order getOrder(@PathVariable Long id);

    String listOrders(@PathVariable Model model);


}
