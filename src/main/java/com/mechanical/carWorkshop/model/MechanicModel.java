package com.mechanical.carWorkshop.model;

import com.mechanical.carWorkshop.dto.MechanicDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MechanicModel {

    @Setter
    @Column(nullable = false)
    private String nome;

    @Setter
    @Column(nullable = false)
    private Integer anos_exp;

    public MechanicModel(MechanicDto dados){
        this.nome = dados.nome();
        this.anos_exp = dados.anos_exp();
    }

    public void update(MechanicDto mechanicDto) {
        if(mechanicDto.nome() != null) {
            this.setNome(mechanicDto.nome());
        }
        if(mechanicDto.anos_exp() != null) {
            this.setAnos_exp(mechanicDto.anos_exp());
        }
    }
}
