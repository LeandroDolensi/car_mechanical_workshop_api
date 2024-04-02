package com.mechanical.carWorkshop.model;

import com.mechanical.carWorkshop.dto.FixDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="car")
@Entity(name = "Car")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class FixModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String entrada;

    @Column(nullable = false)
    private String saida;

    @Embedded
    @Column(nullable = false)
    private MechanicModel mecanico;

    @Embedded
    @Column(nullable = false)
    private VehicleModel veiculo;

    public FixModel(FixDto dados) {
        this.entrada = dados.entrada();
        this.saida = dados.saida();
        this.mecanico = new MechanicModel(dados.mecanico());
        this.veiculo = new VehicleModel(dados.veiculo());
    }
}
