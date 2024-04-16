package com.mechanical.carWorkshop.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MechanicDto(@NotNull
                          @NotBlank
                          String nome,

                          Integer anos_exp) {
}
