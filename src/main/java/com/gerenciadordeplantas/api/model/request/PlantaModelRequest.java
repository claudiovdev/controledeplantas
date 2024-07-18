package com.gerenciadordeplantas.api.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;




@Data
public class PlantaModelRequest {
    @NotBlank
    private String especie;
    @NotBlank
    private String nome;
    @NotNull
    private Long quantidadeSementes;
}
