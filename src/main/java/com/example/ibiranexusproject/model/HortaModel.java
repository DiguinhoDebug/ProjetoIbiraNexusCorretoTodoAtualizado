package com.example.ibiranexusproject.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class HortaModel {

    public HortaModel(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHorta;

    @NotBlank(message = "Preencha o campo do nome!")
    private String nome;

    @NotBlank(message = "Por favor preencha a categoria!")
    private String categoria;

    @NotBlank(message = "O campo localização é obrigatório!")
    private String localizacao; //por enquanto esses dados são String

}
