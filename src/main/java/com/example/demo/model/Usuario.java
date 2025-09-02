package com.example.demo.model;

import java.time.LocalDate;

public class Usuario {

    private String id;
    private String nome;
    private String senha;
    private String documento;
    private String email;
    private Telefone telefone;
    private LocalDate dataNascimento;
    private Endereço endereço;


    public Usuario(String id, String nome, String senha, String documento, String email, Telefone telefone, LocalDate dataNascimento, Endereço endereço) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.documento = documento;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereço = endereço;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereço getEndereço() {
        return endereço;
    }
}
