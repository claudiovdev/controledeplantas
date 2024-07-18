package com.gerenciadordeplantas.domain.model;

import com.gerenciadordeplantas.domain.enums.StatusPlanta;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String codigo;
    @Column(nullable = true)
    private String especie;
    @Column(nullable = true)
    private String nome;
    @Column(nullable = true)
    private LocalDateTime dataPlantio;
    private LocalDateTime dataGerminacao;
    private Long quantidadeSementes;
    private Long quantidadeGerminadas;
    private Long quantidadeMudas;
    private StatusPlanta statusPlanta;
    private Long quantidadeVendidas;

}
