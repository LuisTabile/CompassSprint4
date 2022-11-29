package com.compass.sprint4.political.associados;

import jakarta.validation.constraints.NotNull;

public record DadosCadastro(
        @NotNull
        Long idAssociado,
        @NotNull
        Long idPartido
) {
}
