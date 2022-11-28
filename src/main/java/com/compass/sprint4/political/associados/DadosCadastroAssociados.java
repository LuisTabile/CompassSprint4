package com.compass.sprint4.political.associados;

import com.compass.sprint4.political.enums.CargoPolitico;
import com.compass.sprint4.political.enums.Sexo;

import java.util.Date;

public record DadosCadastroAssociados(
        //O A é de Associados
        String nomeA,
        CargoPolitico cargo,
        Sexo sexo,
        Date dataNasc,
        long idA

) {

}