package com.treinadev.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.treinadev.api.models.SeriesModel;
import com.treinadev.api.repositorys.SeriesRepository;
import com.treinadev.api.services.SeriesService;

@RestController
public class SeriesController {

    @Autowired
    private SeriesRepository repository;

    @Autowired
    private SeriesService service;

    // Cadastrar Serie
    @PostMapping("/api/serie/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody SeriesModel model) {
        return service.cadastrar(model);
    }

    // Listar Serie
    @GetMapping("/api/serie/listar")
    public Iterable<SeriesModel> listar() {
        return service.listeAll();
    }

    // Deletar Serie
    @DeleteMapping("/api/serie/remover/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

    // Alterar Serie
    @PostMapping("/api/serie/alterar")
    public ResponseEntity<?> alterar(@RequestBody SeriesModel model) {
        return service.alterar(model);
    }
    
}
