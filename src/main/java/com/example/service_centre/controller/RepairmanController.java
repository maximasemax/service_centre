package com.example.service_centre.controller;

import com.example.service_centre.entity.Repairman;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface RepairmanController {


    Repairman createRepairman(@RequestBody Repairman repairman);

    Repairman updateRepairman(@PathVariable Long id, @RequestBody Repairman repairman);

    void deleteRepairman(@PathVariable Long id);
}
