package com.mechanical.carWorkshop.model;

import com.mechanical.carWorkshop.dto.FixRequestDto;
import com.mechanical.carWorkshop.dto.FixUpdateDto;
import jakarta.persistence.*;
import lombok.*;

@Table(name="fix")
@Entity(name = "Fix")
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

    @Setter
    @Column(nullable = false)
    private String saida;

    @Embedded
    @Column(nullable = false)
    private MechanicModel mecanico;

    @Embedded
    @Column(nullable = false)
    private VehicleModel veiculo;

    private Boolean ativo;

    public FixModel(FixRequestDto dados) {
        this.ativo = true;
        this.entrada = dados.entrada();
        this.saida = dados.saida();
        this.mecanico = new MechanicModel(dados.mecanico());
        this.veiculo = new VehicleModel(dados.veiculo());
    }

    public void excluir() {
        this.ativo = false;
    }

    public void update(FixUpdateDto fixDto) {
//        String saida,
//        String nomeMecanico,
//        Integer anos_exp
        if(fixDto.saida() != null) {
            this.setSaida(fixDto.saida());
        }
        if(fixDto.mecanico() != null) {
            this.mecanico.update(fixDto.mecanico());
        }
    }
}
