package com.luv4code.msscbrewery.customer.services;

import com.luv4code.msscbrewery.customer.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(String customerId);
}
