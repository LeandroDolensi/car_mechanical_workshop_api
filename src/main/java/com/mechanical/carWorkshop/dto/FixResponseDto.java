package com.mechanical.carWorkshop.dto;

import com.mechanical.carWorkshop.model.FixModel;

public record FixResponseDto(Long id, String entrada, String saida,
                 String nomeMecanico, String modeloVeiculo, String marcaVeiculo
) {

    public FixResponseDto(FixModel fixModel) {
        this(fixModel.getId(), fixModel.getEntrada(), fixModel.getSaida(), fixModel.getMecanico().getNome(),
                fixModel.getVeiculo().getModelo(), fixModel.getVeiculo().getMarca());
    }
}
