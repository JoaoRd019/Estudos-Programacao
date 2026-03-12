# Calculadora de Gorjeta

Um programa simples em Python para calcular gorjetas com diferentes porcentagens.

## Descrição

Este programa permite calcular automaticamente o valor da gorjeta com base no valor total da conta. O usuário pode escolher entre três opções de porcentagem: 10%, 15% ou 20%.

## Funcionalidades

- Entrada do valor da conta
- Escolha entre 3 porcentagens de gorjeta (10%, 15% ou 20%)
- Cálculo automático do valor da gorjeta
- Exibição do valor total a pagar (conta + gorjeta)

## Como Usar

1. Execute o programa:
```bash
python calculadora_gorjeta.py
```

2. Digite o valor da conta quando solicitado

3. Escolha a porcentagem da gorjeta:
   - Digite `1` para 10%
   - Digite `2` para 15%
   - Digite `3` para 20%

4. O programa exibirá:
   - Valor original da conta
   - Valor da gorjeta
   - Total a pagar

## Exemplo de Uso

```
-- Calculadora de Gorjeta --
Digite o valor da conta para calcular a gorjeta: 150.00

Escolha a porcentagem da gorjeta
1. Gorjeta 10%
2. Gorjeta 15%
3. Gorjeta 20%
- Digite aqui: 2

Valor da conta: R$ 150.00
Valor da gorjeta: R$ 22.50
Total a pagar: R$ 172.50
```

## Requisitos

- Python 3.x

## Estrutura do Código

O programa está organizado em funções:

- `exibir_porcentagem()`: Exibe as opções de porcentagem disponíveis
- `mensagem()`: Exibe o resultado do cálculo
- `opcao_escolhida()`: Processa a escolha do usuário e calcula a gorjeta
- `main()`: Função principal que coordena o programa

## Melhorias Futuras

- Adicionar validação de entrada para evitar erros
- Adicionar opção para dividir a conta entre várias pessoas
- Implementar histórico de cálculos

## Autor

Desenvolvido como ferramenta prática para cálculo de gorjetas em restaurantes.