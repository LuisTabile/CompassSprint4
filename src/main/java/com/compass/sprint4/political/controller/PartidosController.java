package com.compass.sprint4.political.controller;

import com.compass.sprint4.political.associados.Associados;
import com.compass.sprint4.political.associados.DadosListagemAssociados;
import com.compass.sprint4.political.associados.DadosUpdateAssociados;
import com.compass.sprint4.political.partidos.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/partidos")
public class PartidosController {
    @Autowired
    private PartidosRepository repository;

    @PostMapping
    public void cadastroPartidos(@RequestBody DadosCadastroPartidos dadosP) {
        repository.save(new Partidos(dadosP));
    }
    @GetMapping
    public List<Partidos> listar() {
        return repository.findAll().stream().toList();
    }
    @GetMapping("/{id}")
    public Optional<Partidos> detalhes (@PathVariable Long id) {
        return repository.findById(id);
    }
    @PutMapping("/{id}")
    @Transactional
    public void update(@PathVariable Long id, @RequestBody @Valid DadosUpdatePartido dados){
        var partidos = repository.getReferenceById(id);
        partidos.atualizarInformacoes(dados);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void delete (@PathVariable Long id){
        repository.deleteById(id);
    }
}
