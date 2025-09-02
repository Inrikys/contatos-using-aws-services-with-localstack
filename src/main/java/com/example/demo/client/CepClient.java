package com.example.demo.client;

import com.example.demo.model.Endereço;

public interface CepClient {

    Endereço obterEnderecoByCep(String cep);

}
