package com.gerenciadordeplantas.api.openapi.controller;

import com.gerenciadordeplantas.api.model.request.PlantaModelRequest;
import com.gerenciadordeplantas.api.model.response.PlantaModelResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name = "Plantas", description = "Gerenciamento de plantas")
public interface PlantasControllerOpenApi {
    @Operation(summary = "Obter todas as plantas", description = "Recupera uma lista de todas as plantas cadastradas.")
    @ApiResponse(responseCode = "200", description = "Lista de plantas recuperada com sucesso.")
    PlantaModelResponse cadastrarPlanta(PlantaModelRequest plantaModelRequest);
}
