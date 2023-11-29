package com.example.service_centre.service;

import com.example.service_centre.entity.Part;
import com.example.service_centre.exception.CustomPartException;
import com.example.service_centre.repository.PartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PartService {

    private final PartRepository partRepository;

    public Part createPart(Part part) {
        return partRepository.save(part);
    }

    public Part updatePart(Long id, Part partDetails) {
        Part part = partRepository.findById(id).orElseThrow(() -> new CustomPartException("Part not found"));
        part.setName(partDetails.getName());
        part.setPrice(partDetails.getPrice());
        part.setOrder(partDetails.getOrder());
        return partRepository.save(part);
    }

    public void deletePart(Long id) {
        Part part = partRepository.findById(id).orElseThrow(() -> new CustomPartException("Part not found"));
        partRepository.delete(part);
    }
}
