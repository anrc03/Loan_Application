package com.enigma.loan_app.service;

import com.enigma.loan_app.dto.request.AuthRequest;
import com.enigma.loan_app.dto.response.CustomerResponse;
import com.enigma.loan_app.entity.Customer;

import java.util.List;

public interface CustomerService {
    CustomerResponse create(Customer customer);
    List<CustomerResponse> getAll();
    CustomerResponse getById(String id);
    CustomerResponse update(AuthRequest request);
    void delete(String id);
}
