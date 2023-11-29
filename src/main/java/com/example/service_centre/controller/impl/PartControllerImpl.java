package com.example.service_centre.controller.impl;

import com.example.service_centre.entity.Part;
import com.example.service_centre.service.PartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parts")
@RequiredArgsConstructor
public class PartControllerImpl {

    private final PartService partService;

    @PostMapping
    public Part createPart(@RequestBody Part part) {
        return partService.createPart(part);
    }

    @PutMapping("/{id}")
    public Part updatePart(@PathVariable Long id, @RequestBody Part part) {
        return partService.updatePart(id, part);
    }

    @DeleteMapping("/{id}")
    public void deletePart(@PathVariable Long id) {
        partService.deletePart(id);
    }
}

