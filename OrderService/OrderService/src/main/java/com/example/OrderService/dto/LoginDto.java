package com.example.OrderService.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginDto {
    private String userNameOrEmail;
    private String password;
}
