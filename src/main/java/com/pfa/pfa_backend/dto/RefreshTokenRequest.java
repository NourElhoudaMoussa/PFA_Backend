package com.pfa.pfa_backend.dto;

import lombok.Data;

@Data
public class RefreshTokenRequest {
    private String token;
    private String refreshToken;
}
