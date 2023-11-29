package com.example.service_centre.service;

import com.example.service_centre.entity.Customer;
import com.example.service_centre.exception.CustomCustomerException;
import com.example.service_centre.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CustomerService {


    private final CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long id, Customer customerDetails) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new CustomCustomerException("Customer not found"));
        customer.setName(customerDetails.getName());
        customer.setPhone(customerDetails.getPhone());
        customer.setEmail(customerDetails.getEmail());
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new CustomCustomerException("Customer not found"));
        customerRepository.delete(customer);
    }
}


