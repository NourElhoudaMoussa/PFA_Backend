package com.pfa.pfa_backend.Service;

import com.pfa.pfa_backend.Entity.Citoyen;
import com.pfa.pfa_backend.dto.JwtAuthenticationResponse;
import com.pfa.pfa_backend.dto.RefreshTokenRequest;
import com.pfa.pfa_backend.dto.SignUpRequest;
import com.pfa.pfa_backend.dto.SigninRequest;

public interface AuthenticationService {
    public Citoyen signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);
    public JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
