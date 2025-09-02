package com.example.demo.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class AdicionarUsuarioRequest {

    @JsonProperty("nome_completo")
    private String nome;

    @JsonProperty("email")
    private String email;

    @JsonProperty("data_nascimento")
    private LocalDate dataNascimento;

    @JsonProperty("ddi")
    private String ddi;

    @JsonProperty("ddd")
    private String ddd;

    @JsonProperty("numero_telefone")
    private String numeroTelefone;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("complemento")
    private String complemento;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getDdi() {
        return ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }
}
