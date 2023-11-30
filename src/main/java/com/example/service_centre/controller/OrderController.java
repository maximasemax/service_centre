package com.example.service_centre.controller;

import com.example.service_centre.entity.Order;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface OrderController {

    String getOrderList(Model model);

    String showOrderManagementPage();

    String getOrder(@RequestParam("id") Long id, Model model);

    String search();


}
