package com.example.demo.entity;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.Map;

@Node
public class Telefone {

    @Id
    private String id;
    private String ddi;
    private String ddd;
    private String numero;

    public Telefone() {
    }

    public Telefone(String ddi, String ddd, String numero) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public Map<String, Object> toCriarNovoTelefoneMap() {
        return Map.of("ddi", ddi,
                "ddd", ddd,
                "numero", numero);
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
