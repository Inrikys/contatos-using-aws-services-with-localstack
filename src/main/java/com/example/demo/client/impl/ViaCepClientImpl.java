package com.example.demo.client.impl;

import com.example.demo.client.CepClient;
import com.example.demo.entity.Endereco;
import org.springframework.stereotype.Service;

@Service
public class ViaCepClientImpl implements CepClient {

    @Override
    public Endereco obterEnderecoByCep(String cep) {
        return new Endereco("Teste", "123", "teste", "teste", "teste", "09990080", "teste");
    }
}
