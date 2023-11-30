package com.example.service_centre.service;

import com.example.service_centre.dto.OrderResponseDto;
import com.example.service_centre.entity.Order;
import com.example.service_centre.exception.CustomOrderException;
import com.example.service_centre.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public  List<OrderResponseDto> getAllOrders(){
        orderRepository.findAll();
        List<Order> orderList = new ArrayList<>(orderRepository.findAll());
        List<OrderResponseDto> orderResponseDtoList = new ArrayList<>();
        for (Order order: orderList ) {

            OrderResponseDto orderResponseDto = OrderResponseDto.builder()
                    .id(order.getId())
                    .orderDate(order.getOrderDate())
                    .status(order.getStatus())
                    .build();
            orderResponseDtoList.add(orderResponseDto);
        }
        return orderResponseDtoList;
    }

    public OrderResponseDto getOrder(Long id) {
        Order order = orderRepository.findById(id).orElseThrow(() ->new CustomOrderException("Order not found"));
        OrderResponseDto orderResponseDto = OrderResponseDto.builder()
                .id(order.getId())
                .orderDate(order.getOrderDate())
                .status(order.getStatus())
                .build();
        return orderResponseDto;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order orderDetails) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new CustomOrderException("Order not found"));
        order.setOrderDate(orderDetails.getOrderDate());
        order.setStatus(orderDetails.getStatus());
        order.setDevice(orderDetails.getDevice());
        order.setRepairman(orderDetails.getRepairman());
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new CustomOrderException("Order not found"));
        orderRepository.delete(order);
    }
}
