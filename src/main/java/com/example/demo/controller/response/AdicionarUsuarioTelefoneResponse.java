package com.example.demo.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdicionarUsuarioTelefoneResponse {

    @JsonProperty("ddi")
    private String ddi;

    @JsonProperty("ddd")
    private String ddd;

    @JsonProperty("numero")
    private String numero;

    public AdicionarUsuarioTelefoneResponse() {
    }

    public AdicionarUsuarioTelefoneResponse(String ddi, String ddd, String numero) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
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
