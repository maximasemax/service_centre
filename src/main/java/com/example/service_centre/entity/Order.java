package com.example.service_centre.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Set;

@Data
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "orderDate")
    private String orderDate;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "devices_id", nullable = false)
    private Device device;

    @ManyToOne
    @JoinColumn(name = "repairman_id", nullable = false)
    private Repairman repairman;
}
