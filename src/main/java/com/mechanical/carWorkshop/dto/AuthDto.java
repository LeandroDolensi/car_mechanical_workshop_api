package com.mechanical.carWorkshop.dto;

import jakarta.validation.constraints.NotBlank;

public record AuthDto(

        @NotBlank
        String login,

        @NotBlank
        String senha) {

}

