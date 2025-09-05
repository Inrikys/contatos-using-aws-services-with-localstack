package com.example.demo.entity;

import com.example.demo.controller.response.ObterUsuarioResponse;
import com.example.demo.controller.response.RegistrarUsuarioResponse;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;

@Node
public class Usuario {

    @Id
    private String id;
    private String nome;
    private String senha;
    private String documento;
    private String email;

    @Relationship(type = "ATENDE_COM")
    private Telefone telefone;
    private LocalDate dataNascimento;

    @Relationship(type = "MORA_EM")
    private Endereco endereco;

    public Usuario(String id, String nome, String senha, String documento, String email, Telefone telefone, LocalDate dataNascimento, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.documento = documento;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public ObterUsuarioResponse toObterUsuarioResponse() {
        return new ObterUsuarioResponse(id, nome, documento,email, telefone.toObterUsuarioTelefoneResponse(), dataNascimento, endereco.toObterUsuarioEnderecoResponse());
    }

    public RegistrarUsuarioResponse toRegistrarUsuarioResponse() {
        return new RegistrarUsuarioResponse(id, nome, email);
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
