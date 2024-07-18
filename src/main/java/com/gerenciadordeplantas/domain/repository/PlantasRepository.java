package com.gerenciadordeplantas.domain.repository;

import com.gerenciadordeplantas.domain.model.Planta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantasRepository extends JpaRepository<Planta, Long> {

}
