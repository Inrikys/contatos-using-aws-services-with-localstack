package com.example.demo.controller;


import com.example.demo.client.CepClient;
import com.example.demo.controller.request.RegistrarUsuarioRequest;
import com.example.demo.controller.response.ObterUsuarioResponse;
import com.example.demo.controller.response.RegistrarUsuarioResponse;
import com.example.demo.entity.Endereco;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("/usuarios")
public class ObterUsuarioController {

    public final UsuarioRepository usuarioRepository;

    public final CepClient cepClient;

    public ObterUsuarioController(UsuarioRepository usuarioRepository, CepClient cepClient) {
        this.usuarioRepository = usuarioRepository;
        this.cepClient = cepClient;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ObterUsuarioResponse> obterUsuarioById(@PathVariable(name = "id") String id) {

        Optional<Usuario> possivelUsuario = usuarioRepository.findById(id);

        AtomicReference<ResponseEntity<ObterUsuarioResponse>> response = new AtomicReference<>();
        possivelUsuario.ifPresentOrElse(
                usuario -> response.set(ResponseEntity.ok(usuario.toObterUsuarioResponse())),
                () -> response.set(ResponseEntity.notFound().build())
        );

        return response.get();
    }

}
