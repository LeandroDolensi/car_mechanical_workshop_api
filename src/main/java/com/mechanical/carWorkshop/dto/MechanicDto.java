package com.mechanical.carWorkshop.dto;

import jakarta.validation.constraints.NotBlank;

public record MechanicDto(

        @NotBlank
        String nome,

        Integer anos_exp) {
}
