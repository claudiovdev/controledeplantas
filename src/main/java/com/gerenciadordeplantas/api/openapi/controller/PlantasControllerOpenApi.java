package com.gerenciadordeplantas.api.openapi.controller;

import com.gerenciadordeplantas.api.execptionhandler.Problema;
import com.gerenciadordeplantas.api.model.request.PlantaModelRequest;
import com.gerenciadordeplantas.api.model.response.PlantaModelResponse;
import com.gerenciadordeplantas.api.openapi.modelosProblema.ProblemaNotFound;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


import java.util.List;


@Tag(name = "Plantas", description = "Gerenciamento de plantas")
public interface PlantasControllerOpenApi {
    @Operation(summary = "Cadastrar planta", description = "Cadastra uma planta")
    @ApiResponse(responseCode = "201", description = "Planta cadastrada com sucesso!!")
    PlantaModelResponse cadastrarPlanta(PlantaModelRequest plantaModelRequest);

    @Operation(summary = "Listar plantas", description = "Serviço criado para listar plantas")
    List<PlantaModelResponse> listarPlantas();

    @Operation(summary = "Buscar planta", description = "Serviço criado para buscar planta por Id")
    @ApiResponses({
            @ApiResponse(responseCode = "400", description = "Id da planta invalido", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Problema.class))),
            @ApiResponse(responseCode = "404", description = "Planta não encontrada", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ProblemaNotFound.class)))
    })
    PlantaModelResponse buscarPlantaPorId(@Parameter(example = "1") Long plantaId);

    @Operation(summary = "Deletar planta", description = "Serviço criado para deletar planta por Id")
    @ApiResponses({
            @ApiResponse(responseCode = "400", description = "Id da planta invalido", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Problema.class))),
            @ApiResponse(responseCode = "404", description = "Planta não encontrada", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ProblemaNotFound.class)))
    })
    void deletarPlanta(@Parameter(example = "1")Long plantaId);
}
