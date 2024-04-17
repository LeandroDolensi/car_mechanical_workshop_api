package com.mechanical.carWorkshop.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record FixRequestDto(

        @NotBlank
        @Pattern(regexp="\\d{2}[/]\\d{2}[/]\\d{4}")
        String entrada,

        @NotBlank
        @Pattern(regexp="\\d{2}[/]\\d{2}[/]\\d{4}")
        String saida,

        @NotNull
        @Valid
        MechanicDto mecanico,

        @NotNull
        @Valid
        VehicleDto veiculo) {
}
