package com.example.demo.entity;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.Map;

@Node
public class Endereco {
    @Id
    private String id;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String bairro, String cidade, String estado, String cep, String complemento) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }

    public Map<String, Object> toCriarNovoEnderecoMap() {
        return Map.of("logradouro", logradouro,
                "numero", numero,
                "bairro", bairro,
                "cidade", cidade,
                "estado", estado,
                "cep", cep,
                "complemento", complemento);
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
