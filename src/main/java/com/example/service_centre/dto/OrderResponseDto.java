package com.example.service_centre.dto;

import lombok.Builder;

@Builder
public class OrderResponseDto {


    private Long id;

    private String orderDate;

    private String status;
}
