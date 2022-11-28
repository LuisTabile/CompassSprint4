package com.compass.sprint4.political.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CargoPolitico {
    VEREADOR,
    PREFEITO,
    @JsonProperty("DEPUTADO ESTADUAL")
    DEPUTADOESTADUAL,
    @JsonProperty("DEPUTADO FEDERAL")
    DEPUTADOFEDERAL,
    SENADOR,
    GOVERNADOR,
    PRESIDENTE,
    NENHUM
}
