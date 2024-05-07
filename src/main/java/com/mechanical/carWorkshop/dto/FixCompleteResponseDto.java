package com.mechanical.carWorkshop.dto;

import com.mechanical.carWorkshop.model.FixModel;

public record FixCompleteResponseDto(
        Long id,
        String entrada,
        String saida,
        String nomeMecanico,
        Integer anosExpMecanico,
        String modeloVeiculo,
        String marcaVeiculo,
        String anoVeiculo,
        String corVeiculo
) {

    public FixCompleteResponseDto(FixModel fixModel) {
        this(fixModel.getId(), fixModel.getEntrada(), fixModel.getSaida(), fixModel.getMecanico().getNome(),
                fixModel.getMecanico().getAnos_exp(), fixModel.getVeiculo().getModelo(),
                fixModel.getVeiculo().getMarca(), fixModel.getVeiculo().getAno(), fixModel.getVeiculo().getCor());
    }
}
