package com.example.ibiranexusproject.repository;

import com.example.ibiranexusproject.model.HortaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HortaRepository extends JpaRepository<HortaModel, Long> {
    List<HortaModel> findByNomeContainingIgnoreCase(String nome);
    List<HortaModel> findByCategoriaContainingIgnoreCase(String categoria);
    List<HortaModel> findByLocalizacaoContainingIgnoreCase(String localizacao);

}
