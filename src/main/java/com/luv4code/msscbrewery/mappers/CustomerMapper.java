package com.luv4code.msscbrewery.mappers;

import com.luv4code.msscbrewery.customer.web.model.CustomerDto;
import com.luv4code.msscbrewery.domain.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDto customerDto);

    CustomerDto customerToCustomerDto(Customer customer);
}
