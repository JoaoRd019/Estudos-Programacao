# Separador de Números Pares e Ímpares

Um programa Python que gera números aleatórios e os separa em duas categorias: pares e ímpares.

## Descrição

Este programa gera automaticamente uma lista com 10 números aleatórios entre 1 e 100, e então separa esses números em duas listas diferentes: uma contendo apenas os números pares e outra com os números ímpares.

## Funcionalidades

- Geração automática de 10 números aleatórios (entre 1 e 100)
- Separação automática entre números pares e ímpares
- Exibição da lista original e das listas separadas

## Como Usar

1. Execute o programa:
```bash
python impar_par.py
```

2. O programa irá:
   - Gerar 10 números aleatórios
   - Exibir a lista completa
   - Mostrar os números pares encontrados
   - Mostrar os números ímpares encontrados

## Exemplo de Saída

```
Lista de numeros: [45, 82, 13, 67, 28, 91, 54, 6, 39, 71]
Numeros pares:  [82, 28, 54, 6]
Numeros impares:  [45, 13, 67, 91, 39, 71]
```

**Nota:** Como os números são gerados aleatoriamente, cada execução produzirá resultados diferentes.

## Requisitos

- Python 3.x
- Módulo `random` (incluído na biblioteca padrão do Python)

## Como Funciona

O programa gera 10 números aleatórios, percorre cada um e verifica se é par ou ímpar usando o operador módulo (`%`). Se o resto da divisão por 2 for zero, o número é par, caso contrário é ímpar. Cada número é então adicionado na lista correspondente.

## Possíveis Melhorias

- Permitir que o usuário defina a quantidade de números a gerar
- Adicionar estatísticas (quantidade de pares vs ímpares, porcentagens)

- Salvar os resultados em um arquivo

## Conceitos Demonstrados

- Números aleatórios
- Estruturas condicionais
- Manipulação de listas
- Operador módulo para verificar paridade

## Autor

Programa educacional para demonstrar conceitos básicos de Python.