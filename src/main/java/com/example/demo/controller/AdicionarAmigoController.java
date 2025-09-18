package com.example.demo.controller;


import com.example.demo.controller.response.AddAmigoResponse;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class AdicionarAmigoController {

    private final UsuarioRepository usuarioRepository;

    public AdicionarAmigoController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping("/{id_usuario}/add/{id_usuario_add}")
    public ResponseEntity<AddAmigoResponse> addAmigo(@PathVariable(name = "id_usuario") String idUsuario,
                                                     @PathVariable(name = "id_usuario_add") String idUsuarioAdd) {

        Usuario usuario = this.usuarioRepository.findById(idUsuario).orElseThrow(() -> new RuntimeException("id:" + idUsuario + " não encontrado"));
        Usuario usuarioASerAdicionado = this.usuarioRepository.findById(idUsuarioAdd).orElseThrow(() -> new RuntimeException("id:" + idUsuarioAdd + " não encontrado"));

        usuario.adiciona(usuarioASerAdicionado);
        usuarioASerAdicionado.adiciona(usuario);

        Usuario usuarioComAmigoAdicionado = usuarioRepository.save(usuario);

        AddAmigoResponse addAmigoResponse = usuarioComAmigoAdicionado.toAddAmigoResponse();

        return ResponseEntity.ok(addAmigoResponse);
    }

}
