package com.luv4code.msscbrewery.customer.services;

import com.luv4code.msscbrewery.customer.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(String customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Madhav Ponnana").build();
    }
}
