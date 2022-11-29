package com.compass.sprint4.political.partidos;

import com.compass.sprint4.political.associados.Associados;
import com.compass.sprint4.political.enums.Ideologia;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Table(name = "partidos")
@Entity(name = "Partidos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idPartido")
public class Partidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPartido;
    @NotBlank(message = "O Campo nome é obrigatório!")
    private String nomeP;
    @NotBlank(message = "O Campo sigla é obrigatório!")
    private String sigla;
    @NotNull(message = "O Campo Data de Fundação é obrigatório!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date fundacao;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "O Campo ideologia é obrigatório!")
    private Ideologia ideologia;

    public Partidos(DadosCadastroPartidos dadosP) {
        this.sigla = dadosP.sigla();
        this.ideologia = dadosP.ideologia();
        this.fundacao = dadosP.fundacao();
        this.nomeP = dadosP.nomeP();
    }

    public void atualizarInformacoes(DadosUpdatePartido dados) {
        if (dados.sigla() != null){
            this.sigla = dados.sigla();
        }
        if (dados.ideologia() != null){
            this.ideologia = dados.ideologia();
        }
        if (dados.fundacao() != null){
            this.fundacao = dados.fundacao();
        }
        if (dados.nomeP() != null){
            this.nomeP = dados.nomeP();
        }
    }
}
