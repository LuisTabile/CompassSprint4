package com.compass.sprint4.political.partidos;

import com.compass.sprint4.political.enums.Ideologia;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public record DadosListagemPartidos(
        Long idPartido,
        String nomeP,
        String sigla,
        Ideologia ideologia,
        Date fundacao
){

}

