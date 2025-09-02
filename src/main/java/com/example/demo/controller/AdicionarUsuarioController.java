package com.example.demo.controller;


import com.example.demo.client.CepClient;
import com.example.demo.controller.request.AdicionarUsuarioRequest;
import com.example.demo.controller.response.AdicionarUsuarioResponse;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdicionarUsuarioController {

    public final UsuarioRepository usuarioRepository;

    public final CepClient cepClient;

    public AdicionarUsuarioController(UsuarioRepository usuarioRepository, CepClient cepClient) {
        this.usuarioRepository = usuarioRepository;
        this.cepClient = cepClient;
    }

    public ResponseEntity<AdicionarUsuarioResponse> adicionarUsuario(@RequestBody AdicionarUsuarioRequest adicionarUsuarioRequest) {


    }

}
