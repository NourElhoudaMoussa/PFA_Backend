package com.pfa.pfa_backend.dto;

import lombok.Data;

@Data
public class SigninRequest {
    private String email;
    private String password;
}
