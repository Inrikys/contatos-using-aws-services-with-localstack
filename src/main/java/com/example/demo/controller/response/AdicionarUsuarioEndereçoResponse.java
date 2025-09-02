package com.example.demo.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdicionarUsuarioEndereçoResponse {

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("cidade")
    private String cidade;

    @JsonProperty("estado")
    private String estado;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("complemento")
    private String complemento;

    public AdicionarUsuarioEndereçoResponse() {
    }

    public AdicionarUsuarioEndereçoResponse(String logradouro, String numero, String bairro, String cidade, String estado, String cep, String complemento) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }
}
