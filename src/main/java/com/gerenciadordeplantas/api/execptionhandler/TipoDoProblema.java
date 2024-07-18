package com.gerenciadordeplantas.api.execptionhandler;

import lombok.Getter;

@Getter
public enum TipoDoProblema {
    ERRO_DE_SISTEMA("/erro-sistema", "Erro no sistema"),
    PARAMETRO_INVALIDO("/parametro-invalido", "Parametro invalido");


    private String title;
    private String uri;

    TipoDoProblema(String path, String title){
        this.uri = "https://controledeplantas.com.br".concat(path);
        this.title = title;
    }

}
