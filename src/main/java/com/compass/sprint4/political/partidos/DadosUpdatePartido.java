package com.compass.sprint4.political.partidos;

import com.compass.sprint4.political.enums.Ideologia;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

public record DadosUpdatePartido(
        String nomeP,
        String sigla,
        Ideologia ideologia,
        Date fundacao,
        @PathVariable
        Long idPartido
) {
}
