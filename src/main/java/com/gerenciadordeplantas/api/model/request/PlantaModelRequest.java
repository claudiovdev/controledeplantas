package com.gerenciadordeplantas.api.model.request;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;



@Data
public class PlantaModelRequest {
    @NotBlank
    @Schema(example = "San Andreas",required = true)
    private String especie;
    @Schema(example = "Morango ",required = true)
    @NotBlank
    private String nome;
    @Schema(example = "1",required = true)
    @NotNull
    private Long quantidadeSementes;
}
