# EAD 3 - API Restful

## Colaboradores:
- Isaac Newton Andrade
- Leandro Dolensi

# Recursos
## Método POST: /fix
 - Cadastro de um serviço de conserto de carro
### Body da Requisição:
```
{
    "entrada": "xx/xx/xxxx",
    "saida": "xx/xx/xxxx",
    "mecanico": {
        "nome": "string",
        "anos_exp": 0
    },
    "veiculo": {
        "marca": "string",
        "modelo": "string",
        "ano": "xxxx",
        "cor": "string"
    }
}
```

#### Descrição da Requisição
 - entrada: data de entrada do veículo no formato xx/xx/xxxx
 - saida: data de saída do veículo no formato xx/xx/xxxx
 - mecanico.nome: nome do mecânico
 - mecanico.anos_exp: anos de experiência do mecânico
 - veiculo.marca:marca do veículo
 - veiculo.modelo: modelo do veículo
 - veiculo.ano: ano do veículo no formato xxxx
 - veiculo.cor: cor do veículo

#### Campos obrigatórios
 - entrada
 - saida
 - mecanico.nome
 - veiculo.marca
 - veiculo.modelo
 - veiculo.ano

## Método GET: /fix
 - Retorna todos os dados de consertos (com recurso de paginação)
### Retorno da requisição
```
{
    "entrada": "xx/xx/xxxx",
    "saida": "xx/xx/xxxx",
    "mecanico": {
        "nome": "string",
        "anos_exp": 0
    },
    "veiculo": {
        "marca": "string",
        "modelo": "string",
        "ano": "xxxx",
        "cor": "string"
    }
}
```
## Método GET: /fix/simple
 - Retorna apenas as datas, nome do mecânico e marca/modelo do veículo
### Retorno da requisição
```
{
    "entrada": "xx/xx/xxxx",
    "saida": "xx/xx/xxxx",
    "mecanico": {
        "nome": "string"
    },
    "veiculo": {
        "marca": "string",
        "modelo": "string"
    }
}
```
