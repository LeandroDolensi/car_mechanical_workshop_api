package com.mechanical.carWorkshop.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record VehicleDto(@NotNull
                         @NotBlank
                         String marca,
                         @NotNull
                         @NotBlank
                         String modelo,

                         @NotBlank
                         @Pattern(regexp="\\d{4}")
                         String ano) {
}
