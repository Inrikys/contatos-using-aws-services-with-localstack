package com.example.demo.controller.request;

import com.example.demo.entity.Endereco;
import com.example.demo.entity.Telefone;
import com.example.demo.entity.Usuario;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.UUID;

public class RegistrarUsuarioRequest {

    @JsonProperty("nome_completo")
    private String nome;

    @JsonProperty("email")
    private String email;

    @JsonProperty("senha")
    private String senha;

    @JsonProperty("documento")
    private String documento;

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

    public Usuario toUsuario(Endereco endereco) {
        endereco.setId(UUID.randomUUID().toString());
        Telefone telefone = new Telefone(UUID.randomUUID().toString(), ddi, ddd, numero);
        return new Usuario(UUID.randomUUID().toString(), nome, senha, documento, email, telefone, dataNascimento, endereco);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getDocumento() {
        return documento;
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
