package com.example.demo.repository;

import com.example.demo.entity.Usuario;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UsuarioRepository extends Neo4jRepository<Usuario, String> {


}
