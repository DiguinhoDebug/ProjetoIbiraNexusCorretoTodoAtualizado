package com.example.ibiranexusproject.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class HortaModel {

    public HortaModel(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne
    @JoinColumn
    private Long idHorta;

    @NotBlank(message = "Preencha o campo do nome!")
    private String nome;

    @NotBlank(message = "Por favor preencha a categoria!")
    private String categoria;

    @NotBlank(message = "O campo localização é obrigatório!")
    private String localizacao; //por enquanto esses dados são String

}
