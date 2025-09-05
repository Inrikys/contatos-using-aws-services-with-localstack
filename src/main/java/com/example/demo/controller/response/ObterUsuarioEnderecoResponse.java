package com.example.demo.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObterUsuarioEnderecoResponse {

    @JsonProperty("id")
    private String id;

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

    public ObterUsuarioEnderecoResponse() {
    }

    public ObterUsuarioEnderecoResponse(String id, String logradouro, String numero, String bairro, String cidade, String estado, String cep, String complemento) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }
}
