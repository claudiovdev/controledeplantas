package com.gerenciadordeplantas.api.model.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlantaModelResponse {

    @Schema(example = "1")
    private Long id;
    @Schema(example = "a7d98d65-cc05-4799-91fd-e38d36fb2f5c")
    private String codigo;
    @Schema(example = "San Andreas")
    private String especie;
    @Schema(example = "Morango")
    private String nome;
    @Schema(example = "2024-07-18T18:36:48.7756511")
    private LocalDateTime dataPlantio;
    @Schema(example = "1")
    private Long quantidadeSementes;
    @Schema(example = "PLANTADA")
    private String statusPlanta;

}
