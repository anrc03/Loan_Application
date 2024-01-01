package com.enigma.loan_app.service;

import com.enigma.loan_app.dto.request.AuthRequest;
import com.enigma.loan_app.dto.response.CustomerResponse;
import com.enigma.loan_app.dto.response.LoginResponse;
import com.enigma.loan_app.dto.response.RegisterResponse;

public interface AuthService {
    CustomerResponse registerCustomer(AuthRequest authRequest);
    LoginResponse login(AuthRequest request);
    RegisterResponse register(AuthRequest authRequest);
}
