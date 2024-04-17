package com.mechanical.carWorkshop.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record VehicleDto(

        @NotBlank
        String marca,

        @NotBlank
        String modelo,

        @NotBlank
        @Pattern(regexp="\\d{4}")
        String ano,

        String cor) {
}
