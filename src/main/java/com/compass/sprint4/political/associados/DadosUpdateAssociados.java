package com.compass.sprint4.political.associados;

import com.compass.sprint4.political.enums.CargoPolitico;
import com.compass.sprint4.political.enums.Sexo;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

public record DadosUpdateAssociados(
        String nomeA,
        CargoPolitico cargo,
        Sexo sexo,
        Date dataNasc,
        @PathVariable
        Long id

) {

}
