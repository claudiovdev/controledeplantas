package com.gerenciadordeplantas.domain.services;

import com.gerenciadordeplantas.api.model.response.PlantaModelResponse;
import com.gerenciadordeplantas.domain.enums.StatusPlanta;
import com.gerenciadordeplantas.domain.exception.PlantaNaoEncontradaException;
import com.gerenciadordeplantas.domain.model.Planta;
import com.gerenciadordeplantas.domain.repository.PlantasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class PlantasService {
    @Autowired
    PlantasRepository plantasRepository;

    public Planta adicionarPlanta(Planta plantas){
        plantas.setCodigo(UUID.randomUUID().toString());
        plantas.setDataPlantio(LocalDateTime.now());
        plantas.setStatusPlanta(StatusPlanta.PLANTADA);
        return plantasRepository.save(plantas);
    }

    public List<Planta> listarTodos() {
        return plantasRepository.findAll();
    }

    public Planta buscarPorId(Long plantaId) {
        return plantasRepository.findById(plantaId).orElseThrow(() -> new PlantaNaoEncontradaException(plantaId));
    }

    public void deletarPlanta(Long plantaId) {
        var planta = buscarPorId(plantaId);
        plantasRepository.delete(planta);
    }
}
