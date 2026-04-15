package com.example.ibiranexusproject.controller;

import com.example.ibiranexusproject.service.HortaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hortas")
public class HortaController {
    private final HortaService service;

    public HortaController(HortaService service){
        this.service = service;
    }
}
