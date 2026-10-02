package com.authify.service;

import com.authify.payload.response.AuthResponse;
import com.authify.payload.request.LoginRequest;
import com.authify.payload.response.TokenResponse;
import com.authify.payload.request.UserRegisterRequest;

public interface AuthService {

    AuthResponse registerUser(UserRegisterRequest request);

    AuthResponse login(LoginRequest request);

    TokenResponse refreshToken(String refreshToken);

    void logout(String accessToken, String refreshToken);

    void deleteAccount(String userId, String password, String accessToken);

}