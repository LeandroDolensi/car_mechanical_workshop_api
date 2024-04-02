package com.mechanical.carWorkshop.model;

import com.mechanical.carWorkshop.dto.MechanicDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MechanicModel {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer anos_exp;

    public MechanicModel(MechanicDto dados){
        this.nome = dados.nome();
        this.anos_exp = dados.anos_exp();
    }
}
