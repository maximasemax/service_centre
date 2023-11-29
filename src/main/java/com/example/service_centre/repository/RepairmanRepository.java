package com.example.service_centre.repository;

import com.example.service_centre.entity.Repairman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairmanRepository extends JpaRepository<Repairman, Long> {
}
