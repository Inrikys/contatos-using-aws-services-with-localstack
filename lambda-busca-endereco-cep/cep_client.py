import requests
from endereco import Endereco

def buscar_endereco(cep: str) -> Endereco:

    print(cep)

    url = f"https://viacep.com.br/ws/{cep}/json/"
    response = requests.get(url)

    if response.status_code != 200:
        raise Exception(f"Erro ao consultar API: {response.status_code}")

    data = response.json()

    print(data)

    if "erro" in data:
        raise ValueError(f"CEP {cep} não encontrado.")

    # Cria objeto Endereco com os campos
    endereco = (
        Endereco.Builder()
        .cep(data.get("cep"))
        .logradouro(data.get("logradouro"))
        .bairro(data.get("bairro"))
        .unidade(data.get("unidade"))
        .complemento(data.get("complemento"))
        .localidade(data.get("localidade"))
        .uf(data.get("uf"))
        .estado(data.get("estado"))
        .regiao(data.get("regiao"))
        .ibge(data.get("ibge"))
        .gia(data.get("gia"))
        .ddd(data.get("ddd"))
        .siafi(data.get("siafi"))
        .build()
    )

    return endereco