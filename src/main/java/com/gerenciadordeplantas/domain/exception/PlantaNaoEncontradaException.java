package com.gerenciadordeplantas.domain.exception;

public class PlantaNaoEncontradaException extends EntidadeNaoEncontradaException {
    public PlantaNaoEncontradaException(Long plantaId) {
        super(String.format("Não foi possivel encontrar uma planta com id: %d",plantaId));
    }


}
