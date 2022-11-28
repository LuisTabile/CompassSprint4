package com.compass.sprint4.political.associados;

import com.compass.sprint4.political.enums.CargoPolitico;
import com.compass.sprint4.political.enums.Sexo;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Table(name = "associados")
@Entity(name = "Associados")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idAssociado")
public class Associados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAssociado;
    @NotBlank(message = "O Campo nome é obrigatório!")
    private String nomeA;
    @NotNull(message = "O Campo Data de Nascimento é obrigatório!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataNasc;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "O Campo cargo é obrigatório!")
    private CargoPolitico cargo;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "O campo sexo é obrigatório!")
    private Sexo sexo;
    public Associados(DadosCadastroAssociados dadosA) {
        this.cargo = dadosA.cargo();
        this.nomeA = dadosA.nomeA();
        this.sexo = dadosA.sexo();
        this.dataNasc = dadosA.dataNasc();
    }
}
