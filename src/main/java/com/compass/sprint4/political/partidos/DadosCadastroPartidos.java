package com.compass.sprint4.political.partidos;

import com.compass.sprint4.political.enums.Ideologia;

import java.util.Date;

public record DadosCadastroPartidos(
        String nomeP,
        String sigla,
        Ideologia ideologia,
        Date fundacao,
        long idP

) {
}
