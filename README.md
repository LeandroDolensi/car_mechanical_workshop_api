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
    "entrada": "dd/mm/aaaa",
    "saida": "dd/mm/aaaa",
    "mecanico": {
        "nome": "string",
        "anos_exp": 0
    },
    "veiculo": {
        "marca": "string",
        "modelo": "string",
        "ano": "aaaa",
        "cor": "string"
    }
}
```

#### Descrição da Requisição
 - entrada: data de entrada do veículo no formato "dd/mm/aaaa"
 - saida: data de saída do veículo no formato "dd/mm/aaaa"
 - mecanico.nome: nome do mecânico
 - mecanico.anos_exp: anos de experiência do mecânico
 - veiculo.marca:marca do veículo
 - veiculo.modelo: modelo do veículo
 - veiculo.ano: ano do veículo no formato "aaaa"
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
    "entrada": "dd/mm/aaaa",
    "saida": "dd/mm/aaaa",
    "mecanico": {
        "nome": "string",
        "anos_exp": 0
    },
    "veiculo": {
        "marca": "string",
        "modelo": "string",
        "ano": "aaaa",
        "cor": "string"
    }
}
```
## Método GET: /fix/simple
 - Retorna apenas as datas, nome do mecânico e marca/modelo do veículo
### Retorno da requisição
```
{
    "entrada": "dd/mm/aaaa",
    "saida": "dd/mm/aaaa",
    "nomeMecanico": "string",
    "modeloVeiculo" "string",
    "marcaVeiculo": "string"
}
```
