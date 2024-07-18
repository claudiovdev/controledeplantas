package com.gerenciadordeplantas.api.model.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlantaModelResponse {
    private Long id;
    private String codigo;
    private String especie;
    private String nome;
    private LocalDateTime dataPlantio;
    private Long quantidadeSementes;
    private String statusPlanta;

}
