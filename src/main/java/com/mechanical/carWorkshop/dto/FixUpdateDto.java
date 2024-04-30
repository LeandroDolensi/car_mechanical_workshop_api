package com.mechanical.carWorkshop.dto;

import jakarta.validation.constraints.NotNull;

public record FixUpdateDto(
        @NotNull
        Long id,
        String saida,
        MechanicDto mecanico
) { }
