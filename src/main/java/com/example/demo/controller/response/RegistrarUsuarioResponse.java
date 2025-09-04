package com.example.demo.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistrarUsuarioResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("email")
    private String email;


    public RegistrarUsuarioResponse() {
    }

    public RegistrarUsuarioResponse(String id, String nome,  String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
