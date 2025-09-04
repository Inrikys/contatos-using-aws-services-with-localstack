//package com.example.demo.repository.impl;
//
//import com.example.demo.entity.Usuario;
//import com.example.demo.repository.UsuarioRepository;
//import org.apache.tinkerpop.gremlin.driver.Client;
//import org.apache.tinkerpop.gremlin.driver.Result;
//
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class UsuarioRepositoryImpl implements UsuarioRepository {
//
//    private final Client client;
//
//    public UsuarioRepositoryImpl(Client client) {
//        this.client = client;
//    }
//
//    @Override
//    public Usuario criarUsuario(Usuario usuario) {
//        client.submit("g.addV('usuario').property('nome', name).property('age', age)",
//                Map.of("nome", usuario, "age", age));
//    }
//
//    @Override
//    public Usuario consultarUsuarioByEmail(String email) {
//        List<Result> results = client.submit("g.V().has('usuario', 'email', email).property('name')").all().join();
//        results.stream().map(Result::getString).collect(Collectors.toList());
//
//        return null;
//    }
//
//    @Override
//    public Usuario adicionarAmigo(String id) {
//        return null;
//    }
//
//    public void createPerson(String name, int age) {
//
//    }
//
//    public List<String> getAllPersons() {
//
//    }
//
//    public void updatePerson(String name, int age) {
//        client.submit("g.V().has('person','name',name).property('age', age)",
//                Map.of("name", name, "age", age));
//    }
//
//    public void deletePerson(String name) {
//        client.submit("g.V().has('person','name',name).drop()", Map.of("name", name));
//    }
//}
