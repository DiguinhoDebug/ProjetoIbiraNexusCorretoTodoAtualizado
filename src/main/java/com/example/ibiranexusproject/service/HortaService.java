package com.example.ibiranexusproject.service;

import com.example.ibiranexusproject.model.HortaModel;
import com.example.ibiranexusproject.repository.HortaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HortaService {
    private final HortaRepository repository;

    public HortaService(HortaRepository repository){
        this.repository = repository;
    }

    public List<HortaModel> listar(){
        return repository.findAll();
    }

    public List<HortaModel> buscarPorNome(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<HortaModel> buscarPorCategoria(String categoria){
        return repository.findByCategoriaContainingIgnoreCase(categoria);
    }

    public List<HortaModel> buscarPorLocalizacao(String localizacao){
        return repository.findByLocalizacaoContainingIgnoreCase(localizacao);
    }

    public HortaModel cadastrar(HortaModel horta){
        return repository.save(horta);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
