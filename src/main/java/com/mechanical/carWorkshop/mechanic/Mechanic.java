package com.mechanical.carWorkshop.mechanic;

import com.mechanical.carWorkshop.car.DadosCar;
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
public class Mechanic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer anos_exp;

    public Mechanic(DadosMechanic dados){
        this.nome = dados.nome();
        this.anos_exp = dados.anos_exp();
    }
}
