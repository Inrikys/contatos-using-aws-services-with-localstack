package com.example.demo.entity;

import com.example.demo.controller.response.ObterUsuarioTelefoneResponse;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.Map;
import java.util.UUID;

@Node
public class Telefone {

    @Id
    private String id;
    private String ddi;
    private String ddd;
    private String numero;

    public Telefone() {
    }

    public Telefone(String id, String ddi, String ddd, String numero) {
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

    public ObterUsuarioTelefoneResponse toObterUsuarioTelefoneResponse() {
        return new ObterUsuarioTelefoneResponse(id, ddi, ddd, numero);
    }
}
