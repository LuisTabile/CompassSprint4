package com.compass.sprint4.political.associados;

import com.compass.sprint4.political.enums.CargoPolitico;
import com.compass.sprint4.political.enums.Sexo;

import java.util.Date;

public record DadosListagemAssociados(
        Long idAssociado,
        String nomeAssociado,
        CargoPolitico cargo,
        Date dataNasc,
        Sexo sexo
) {
    public DadosListagemAssociados (Associados associados){
        this(associados.getIdAssociado(),associados.getNomeA(),associados.getCargo(), associados.getDataNasc(),associados.getSexo());
    }
}
