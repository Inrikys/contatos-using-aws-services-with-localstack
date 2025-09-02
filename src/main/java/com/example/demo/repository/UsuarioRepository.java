package com.example.demo.repository;

import com.example.demo.model.Usuario;

public interface UsuarioRepository {

    Usuario criarUsuario(Usuario usuario);
    Usuario consultarUsuarioByEmail(String email);

}
