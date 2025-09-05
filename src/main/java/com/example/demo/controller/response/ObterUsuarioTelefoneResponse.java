package com.example.demo.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObterUsuarioTelefoneResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("ddi")
    private String ddi;

    @JsonProperty("ddd")
    private String ddd;

    @JsonProperty("numero")
    private String numero;

    public ObterUsuarioTelefoneResponse() {
    }

    public ObterUsuarioTelefoneResponse(String id, String ddi, String ddd, String numero) {
        this.id = id;
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getId() {
        return id;
    }

    public String getDdi() {
        return ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
