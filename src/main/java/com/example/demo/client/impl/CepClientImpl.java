package com.example.demo.client.impl;

import com.example.demo.awsservices.LambdaService;
import com.example.demo.client.CepClient;
import com.example.demo.entity.Endereco;
import org.springframework.stereotype.Service;

@Service
public class CepClientImpl implements CepClient {

    private final LambdaService lambdaService;

    public CepClientImpl(LambdaService lambdaService) {
        this.lambdaService = lambdaService;
    }

    @Override
    public Endereco obterEnderecoByCep(String cep) {

        String lambdaResponse = lambdaService.invokeLambda("cepclient", "09990080");

        return new Endereco(null, "Teste", "123", "teste", "teste", "teste", "09990080", "teste");
    }
}
