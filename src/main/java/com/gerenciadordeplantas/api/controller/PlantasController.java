package com.gerenciadordeplantas.api.controller;

import com.gerenciadordeplantas.api.mapper.PlantaModelAssembler;
import com.gerenciadordeplantas.api.model.request.PlantaModelRequest;
import com.gerenciadordeplantas.api.model.response.PlantaModelResponse;
import com.gerenciadordeplantas.api.openapi.controller.PlantasControllerOpenApi;
import com.gerenciadordeplantas.domain.services.PlantasService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/plantas")
public class PlantasController implements PlantasControllerOpenApi {

    @Autowired
    private PlantasService plantasService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/cadastrar")
    public PlantaModelResponse cadastrarPlanta(@Valid @RequestBody PlantaModelRequest plantaModelRequest){
        var planta = PlantaModelAssembler.toModel(plantaModelRequest);
        return  PlantaModelAssembler.toModelResponse(plantasService.adicionarPlanta(planta));
    }

    @GetMapping
    public List<PlantaModelResponse> listarPlantas(){
        return PlantaModelAssembler.toListModelResponse(plantasService.listarTodos());
    }

    @GetMapping("{plantaId}")
    public PlantaModelResponse buscarPlantaPorId(@PathVariable Long plantaId){
        return PlantaModelAssembler.toModelResponse(plantasService.buscarPorId(plantaId));
    }

    @DeleteMapping("{plantaId}")
    public void deletarPlanta(@PathVariable Long plantaId){
        plantasService.deletarPlanta(plantaId);
    }

}
