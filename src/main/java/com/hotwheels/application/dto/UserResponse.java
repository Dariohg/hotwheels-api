package com.hotwheels.application.dto;

import lombok.Data;

@Data
public class UserResponse {
    private Long id;
    private String nombre;
    private String username;
    private String email;
    private String telefono;
    private Integer edad;
}