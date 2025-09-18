package com.example.demo.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Set;

public class ObterUsuarioResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("documento")
    private String documento;

    @JsonProperty("email")
    private String email;

    @JsonProperty("telefone")
    private ObterUsuarioTelefoneResponse telefone;

    @JsonProperty("data_nascimento")
    private LocalDate dataNascimento;

    @JsonProperty("endereco")
    private ObterUsuarioEnderecoResponse endereco;

    @JsonProperty("amigos")
    private Set<ObterUsuarioAmigoResponse> amigos;

    public ObterUsuarioResponse() {
    }

    public ObterUsuarioResponse(String id, String nome, String documento, String email, ObterUsuarioTelefoneResponse telefone, LocalDate dataNascimento, ObterUsuarioEnderecoResponse endereco, Set<ObterUsuarioAmigoResponse> amigos) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.amigos = amigos;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public ObterUsuarioTelefoneResponse getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public ObterUsuarioEnderecoResponse getEndereco() {
        return endereco;
    }
}
