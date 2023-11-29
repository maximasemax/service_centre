package com.example.service_centre.service;

import com.example.service_centre.entity.Device;
import com.example.service_centre.exception.CustomDeviceException;
import com.example.service_centre.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceService {

    private final DeviceRepository deviceRepository;

    public Device createDevice(Device device) {
        return deviceRepository.save(device);
    }

    public Device updateDevice(Long id, Device deviceDetails) {
        Device device = deviceRepository.findById(id).orElseThrow(() -> new CustomDeviceException("Device not found"));
        device.setModel(deviceDetails.getModel());
        device.setSerialNumber(deviceDetails.getSerialNumber());
        device.setCustomer(deviceDetails.getCustomer());
        return deviceRepository.save(device);
    }

    public void deleteDevice(Long id) {
        Device device = deviceRepository.findById(id).orElseThrow(() -> new CustomDeviceException("Device not found"));
        deviceRepository.delete(device);
    }
}
