package com.example.demo.controller;


import com.example.demo.client.CepClient;
import com.example.demo.controller.request.RegistrarUsuarioRequest;
import com.example.demo.controller.response.RegistrarUsuarioResponse;
import com.example.demo.entity.Endereco;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/usuarios")
public class RegistrarUsuarioController {

    public final UsuarioRepository usuarioRepository;

    public final CepClient cepClient;

    public RegistrarUsuarioController(UsuarioRepository usuarioRepository, CepClient cepClient) {
        this.usuarioRepository = usuarioRepository;
        this.cepClient = cepClient;
    }

    @PostMapping
    public ResponseEntity<RegistrarUsuarioResponse> adicionarUsuario(@RequestBody RegistrarUsuarioRequest registrarUsuarioRequest, UriComponentsBuilder uriComponentsBuilder) {

        Endereco endereco = cepClient.obterEnderecoByCep("09990080");
        Usuario usuario = registrarUsuarioRequest.toUsuario(endereco);

        Usuario usuarioRegistrado = usuarioRepository.save(usuario);

        URI location = uriComponentsBuilder.path("/usuarios/{id}").buildAndExpand(usuarioRegistrado.getId()).toUri();

        return ResponseEntity.created(location).body(usuarioRegistrado.toRegistrarUsuarioResponse());
    }

}
