package com.mechanical.carWorkshop.dto;

import com.mechanical.carWorkshop.model.FixModel;

public record FixSimpleResponseDto(Long id, String entrada, String saida,
                                   String nomeMecanico, String modeloVeiculo, String marcaVeiculo
) {

    public FixSimpleResponseDto(FixModel fixModel) {
        this(fixModel.getId(), fixModel.getEntrada(), fixModel.getSaida(), fixModel.getMecanico().getNome(),
                fixModel.getVeiculo().getModelo(), fixModel.getVeiculo().getMarca());
    }
}
