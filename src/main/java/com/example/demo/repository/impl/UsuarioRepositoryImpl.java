package com.example.demo.repository.impl;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

public class UsuarioRepositoryImpl implements UsuarioRepository {
    @Override
    public Usuario criarUsuario(Usuario usuario) {
        return usuario;
    }

    @Override
    public Usuario consultarUsuarioByEmail(String email) {
        return null;
    }
}
