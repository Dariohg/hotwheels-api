// application/dto/UserRequest.java
package com.hotwheels.application.dto;

import jakarta.validation.constraints.*;

public record UserRequest(
        @NotBlank String nombre,
        @NotBlank String username,
        @NotBlank @Email String email,
        @NotBlank String phoneNumber,
        @Min(12) @Max(120) int edad,
        @NotBlank String password
) {}