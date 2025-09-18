package com.example.demo.controller.response;

import com.example.demo.entity.Usuario;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public class AddAmigoResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("amigos")
    private Set<AddAmigoAmigoResponse> amigos;

    public AddAmigoResponse(String id, String nome, Set<AddAmigoAmigoResponse> amigos) {
        this.id = id;
        this.nome = nome;
        this.amigos = amigos;
    }

    public AddAmigoResponse() {
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Set<AddAmigoAmigoResponse> getAmigos() {
        return amigos;
    }
}
