package com.example.service_centre.controller.impl;

import com.example.service_centre.controller.RepairmanController;
import com.example.service_centre.entity.Repairman;
import com.example.service_centre.service.RepairmanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/repairmen")
@RequiredArgsConstructor
public class RepairmanControllerImpl implements RepairmanController {

    private final RepairmanService repairmanService;

    @PostMapping
    public Repairman createRepairman(@RequestBody Repairman repairman) {
        return repairmanService.createRepairman(repairman);
    }

    @PutMapping("/{id}")
    public Repairman updateRepairman(@PathVariable Long id, @RequestBody Repairman repairman) {
        return repairmanService.updateRepairman(id, repairman);
    }

    @DeleteMapping("/{id}")
    public void deleteRepairman(@PathVariable Long id) {
        repairmanService.deleteRepairman(id);
    }
}

