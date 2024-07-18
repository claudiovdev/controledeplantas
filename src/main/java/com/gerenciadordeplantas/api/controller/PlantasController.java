package com.gerenciadordeplantas.api.controller;

import com.gerenciadordeplantas.api.mapper.PlantaModelAssembler;
import com.gerenciadordeplantas.api.model.request.PlantaModelRequest;
import com.gerenciadordeplantas.api.model.response.PlantaModelResponse;
import com.gerenciadordeplantas.api.openapi.controller.PlantasControllerOpenApi;
import com.gerenciadordeplantas.domain.services.PlantasService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plantas")
public class PlantasController implements PlantasControllerOpenApi {

    @Autowired
    private PlantasService plantasService;

    @Override
    @PostMapping("/cadastrar")
    public PlantaModelResponse cadastrarPlanta(PlantaModelRequest plantaModelRequest){
        var planta = PlantaModelAssembler.toModel(plantaModelRequest);
        return  PlantaModelAssembler.toModelResponse(plantasService.adicionarPlanta(planta));
    }
}
