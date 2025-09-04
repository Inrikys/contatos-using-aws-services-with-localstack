package com.example.demo.client;

import com.example.demo.entity.Endereco;

public interface CepClient {

    Endereco obterEnderecoByCep(String cep);

}
