package com.example.demo.entity;

import com.example.demo.controller.response.*;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

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

    @Relationship(type = "ADICIONOU")
    private Set<Usuario> amigos;

    public Usuario(String id, String nome, String senha, String documento, String email, Telefone telefone, LocalDate dataNascimento, Endereco endereco, Set<Usuario> amigos) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.documento = documento;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.amigos = amigos;
    }

    public ObterUsuarioResponse toObterUsuarioResponse() {
        Set<ObterUsuarioAmigoResponse> amigosAdicionados = amigos.stream().map(Usuario::toObterUsuarioAmigoResponse).collect(Collectors.toSet());
        return new ObterUsuarioResponse(id, nome, documento, email, telefone.toObterUsuarioTelefoneResponse(), dataNascimento, endereco.toObterUsuarioEnderecoResponse(), amigosAdicionados);
    }

    public ObterUsuarioAmigoResponse toObterUsuarioAmigoResponse() {
        return new ObterUsuarioAmigoResponse(id, nome, email);
    }

    public RegistrarUsuarioResponse toRegistrarUsuarioResponse() {
        return new RegistrarUsuarioResponse(id, nome, email);
    }

    public AddAmigoResponse toAddAmigoResponse() {
        Set<AddAmigoAmigoResponse> amigosAdicionados = amigos.stream().map(Usuario::toAddAmigoAmigoResponse).collect(Collectors.toSet());
        return new AddAmigoResponse(id, nome, amigosAdicionados);
    }


    public AddAmigoAmigoResponse toAddAmigoAmigoResponse() {
        return new AddAmigoAmigoResponse(id, nome, email);
    }

    public void adiciona(Usuario amigo) {
        this.amigos.add(amigo);
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

    public Set<Usuario> getAmigos() {
        return amigos;
    }
}
