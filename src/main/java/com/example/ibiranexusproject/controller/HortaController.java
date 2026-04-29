package com.example.ibiranexusproject.controller;

import com.example.ibiranexusproject.model.HortaModel;
import com.example.ibiranexusproject.service.HortaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/hortas")
public class HortaController {
    private final HortaService service;

    public HortaController(HortaService service){
        this.service = service;
    }

    @GetMapping
    public List<HortaModel> listar(){
        return service.listar();
    }

    @PostMapping
    public HortaModel cadastrar(@RequestBody @Valid HortaModel horta){
        return service.cadastrar(horta);
    }

    @GetMapping("/buscarPorNome")
    public List<HortaModel> buscarPorNome(@RequestParam String nome){
        return service.buscarPorNome(nome);
    }

    @GetMapping("/buscarPorCategoria")
    public List<HortaModel> buscarPorCategoria(@RequestParam String categoria){
        return service.buscarPorCategoria(categoria);
    }

    @GetMapping("/buscarPorLocalizacao")
    public List<HortaModel> buscarPorLocalizacao(@RequestParam String localizacao){
        return service.buscarPorLocalizacao(localizacao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

    public HortaModel alterar(@PathVariable Long id,@RequestBody @Valid HortaModel horta){
        service.deletar(id);
        return service.cadastrar(horta);
    }
}
