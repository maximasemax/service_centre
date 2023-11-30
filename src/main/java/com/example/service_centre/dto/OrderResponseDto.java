package com.example.service_centre.dto;

import lombok.Builder;

@Builder
public class OrderResponseDto {


    public Long id;

    public String orderDate;

    public String status;
}
