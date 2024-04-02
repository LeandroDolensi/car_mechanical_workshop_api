package com.mechanical.carWorkshop.model;

import com.mechanical.carWorkshop.dto.MechanicDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="mechanic")
@Entity(name = "Mechanic")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class MechanicModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer anos_exp;

    public MechanicModel(MechanicDto dados){
        this.nome = dados.nome();
        this.anos_exp = dados.anos_exp();
    }
}
