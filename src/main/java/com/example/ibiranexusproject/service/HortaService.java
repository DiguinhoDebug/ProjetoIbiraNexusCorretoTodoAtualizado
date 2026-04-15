package com.example.ibiranexusproject.service;

import com.example.ibiranexusproject.repository.HortaRepository;
import org.springframework.stereotype.Service;


@Service
public class HortaService {
    private final HortaRepository repository;

    public HortaService(HortaRepository repository){
        this.repository = repository;
    }

}
