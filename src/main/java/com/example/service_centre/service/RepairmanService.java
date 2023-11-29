package com.example.service_centre.service;

import com.example.service_centre.entity.Repairman;
import com.example.service_centre.exception.CustomRepairmanException;
import com.example.service_centre.repository.RepairmanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RepairmanService {

    private final RepairmanRepository repairmanRepository;

    public Repairman createRepairman(Repairman repairman){
        return repairmanRepository.save(repairman);
    }

    public Repairman updateRepairman(Long id, Repairman repairmanDetails) {
        Repairman repairman = repairmanRepository.findById(id).orElseThrow(() -> new CustomRepairmanException("Repairman not found"));
        repairman.setName(repairmanDetails.getName());
        repairman.setSpecialization(repairmanDetails.getSpecialization());
        return repairmanRepository.save(repairman);
    }

    public void deleteRepairman(Long id) {
        Repairman repairman = repairmanRepository.findById(id).orElseThrow(() -> new CustomRepairmanException("Repairman not found"));
        repairmanRepository.delete(repairman);
    }
}
