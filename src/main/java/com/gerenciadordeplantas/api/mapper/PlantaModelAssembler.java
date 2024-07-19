package com.gerenciadordeplantas.api.mapper;

import com.gerenciadordeplantas.api.model.request.PlantaModelRequest;
import com.gerenciadordeplantas.api.model.response.PlantaModelResponse;
import com.gerenciadordeplantas.domain.model.Planta;

import java.util.List;
import java.util.stream.Collectors;

public class PlantaModelAssembler {
    public static PlantaModelResponse toModelResponse(Planta planta){
        var plantaReponse = new PlantaModelResponse();
        plantaReponse.setId(planta.getId());
        plantaReponse.setCodigo(planta.getCodigo());
        plantaReponse.setEspecie(planta.getEspecie());
        plantaReponse.setNome(planta.getNome());
        plantaReponse.setDataPlantio(planta.getDataPlantio());
        plantaReponse.setStatusPlanta(planta.getStatusPlanta().toString());
        plantaReponse.setQuantidadeSementes(planta.getQuantidadeSementes());
        return plantaReponse;
    }

    public static Planta toModel(PlantaModelRequest plantaModelRequest){
        var planta = new Planta();
        planta.setEspecie(plantaModelRequest.getEspecie());
        planta.setNome(plantaModelRequest.getNome());
        planta.setQuantidadeSementes(plantaModelRequest.getQuantidadeSementes());
        return planta;
    }

    public static List<PlantaModelResponse> toListModelResponse(List<Planta> plantas){
        return plantas.stream().map(planta -> toModelResponse(planta)).collect(Collectors.toList());
    }

}
