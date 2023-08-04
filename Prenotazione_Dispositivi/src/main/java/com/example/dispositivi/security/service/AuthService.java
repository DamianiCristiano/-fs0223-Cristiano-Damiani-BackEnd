package com.example.dispositivi.security.service;

import com.example.dispositivi.security.payload.LoginDto;
import com.example.dispositivi.security.payload.RegisterDto;

public interface AuthService {

	String login(LoginDto loginDto);

	String register(RegisterDto registerDto);

}
