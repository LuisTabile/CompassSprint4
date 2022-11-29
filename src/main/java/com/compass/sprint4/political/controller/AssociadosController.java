package com.compass.sprint4.political.controller;

import com.compass.sprint4.political.associados.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/associados")
public class AssociadosController {
    @Autowired
    private AssociadosRepository repository;

    @PostMapping
    public void cadastroAssociados(@RequestBody DadosCadastroAssociados dadosA) {
        repository.save(new Associados(dadosA));
    }
    @GetMapping
    public List<DadosListagemAssociados> listar() {
        return repository.findAll().stream().map(DadosListagemAssociados::new).toList();
    }
    @GetMapping("/{id}")
    public Optional<Associados> detalhes (@PathVariable Long id) {
        return repository.findById(id);
    }
    @PutMapping("/{id}")
    @Transactional
    public void update(@PathVariable Long id, @RequestBody @Valid DadosUpdateAssociados dados){
        var associado = repository.getReferenceById(id);
        associado.atualizarInformacoes(dados);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
