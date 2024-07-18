package com.gerenciadordeplantas.domain.services;

import com.gerenciadordeplantas.domain.enums.StatusPlanta;
import com.gerenciadordeplantas.domain.model.Planta;
import com.gerenciadordeplantas.domain.repository.PlantasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
}
