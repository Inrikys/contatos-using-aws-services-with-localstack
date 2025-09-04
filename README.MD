# 📋 Requisitos da API de Contatos

## 🧑‍💻 Estrutura do Contato
Um **contato** deve possuir:
- **ID único** (UUID)
- **Nome completo**
- **E-mail**
- **Telefone**
- **Data de nascimento**
- **Endereço**:
    - Logradouro
    - Número
    - Bairro
    - Cidade
    - Estado
    - CEP

---

## ⚙️ Requisitos Funcionais

1. **CRUD de contatos via aplicação Java**
    - A aplicação Java será responsável por:
        - Criar um contato
        - Consultar contatos por **nome**, **e-mail** ou **cidade**
        - Atualizar dados de um contato
        - Remover contatos

2. **Exportação de contatos**
    - Deve ser possível exportar contatos em formato **CSV** ou **Parquet** para um bucket **S3**.

3. **Processamento assíncrono com SQS**
    - Quando um contato for criado, deve ser enviada uma mensagem para uma fila **SQS** para execução de processos adicionais (exemplo: enriquecimento de dados do endereco).

4. **Publicação de eventos com SNS**
    - Sempre que um contato for atualizado ou removido, um evento deve ser publicado em um tópico **SNS** para notificar outros sistemas interessados.

5. **Função Lambda para validação de e-mails**
    - A aplicação Java deve enviar solicitações para uma **Lambda** que fará a validação de formato e duplicidade de e-mails antes de persistir o contato.
    - Caso o e-mail seja inválido ou já exista, o contato não deve ser salvo.

6. **Relatórios e transformação de dados com Glue**
    - O **Glue** deve transformar os arquivos exportados no S3 em tabelas organizadas para análises, como:
        - Quantidade de contatos por cidade
        - Distribuição de contatos por faixa etária

---

## 🔒 Requisitos Não Funcionais

- O banco de dados deve ser o **Amazon Neptune**, pois permite consultas avançadas em grafos, simulando redes de contatos (exemplo: "quem mora na mesma rua").
- A API deve ser implementada em **Java (Spring Boot)**, separando lógica de negócio da infraestrutura.
- O sistema deve ser **desacoplado e resiliente**, utilizando filas (SQS) e tópicos (SNS).
- Todos os serviços devem ser possíveis de rodar **localmente usando Localstack**, garantindo desenvolvimento e testes sem depender da AWS real.

---

## ☁️ Tecnologias AWS utilizadas

- **Amazon Neptune** → Banco de grafos para armazenar contatos e seus relacionamentos
- **AWS Lambda** → Validação de e-mails antes da persistência
- **Amazon SQS** → Processamento assíncrono de eventos de criação de contatos
- **Amazon SNS** → Notificação de eventos de atualização/remoção
- **Amazon S3** → Armazenamento de relatórios exportados
- **AWS Glue** → ETL e análises sobre os dados exportados  
