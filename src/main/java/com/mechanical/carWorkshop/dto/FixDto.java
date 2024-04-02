package com.mechanical.carWorkshop.dto;

import com.mechanical.carWorkshop.model.VehicleModel;
import com.mechanical.carWorkshop.model.MechanicModel;

public record FixDto(Long id, String entrada, String saida, MechanicDto mecanico, VehicleDto veiculo) {
}
