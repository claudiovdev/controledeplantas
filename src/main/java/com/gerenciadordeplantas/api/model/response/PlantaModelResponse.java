package com.gerenciadordeplantas.api.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @Schema(example = "18-07-2024T18:45:46Z")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy'T'HH:mm:ss'Z'")
    private LocalDateTime dataPlantio;
    @Schema(example = "1")
    private Long quantidadeSementes;
    @Schema(example = "PLANTADA")
    private String statusPlanta;

}
