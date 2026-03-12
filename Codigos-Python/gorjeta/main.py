
def exibir_porcentagem():
    print("\nEscolha a porcentagem da gorjeta")
    print("1. Gorjeta 10%")
    print("2. Gorjeta 15%")
    print("3. Gorjeta 20%")

def mensagem(valor_conta, conta):
    print(f"\nValor da conta: R$ {valor_conta:.2f}")
    print(f"Valor da gorjeta: R$ {conta:.2f}")
    print(f"Total a pagar: R$ {valor_conta + conta:.2f}")

def opcao_escolhida(valor_conta):
    opcao = int(input("- Digite aqui: "))
    if opcao == 1:
        conta = valor_conta * 0.1
        mensagem(valor_conta, conta)
    elif opcao == 2:
        conta = valor_conta * 0.15
        mensagem(valor_conta, conta) 
    elif opcao == 3:
        conta = valor_conta * 0.2
        mensagem(valor_conta, conta) 
    else:
        print("Digite uma opção válida")


def main():
    valor_conta = float(input("Digite o valor da conta para calcular a gorjeta: "))
    exibir_porcentagem()
    opcao_escolhida(valor_conta)

if __name__ == "__main__":
    main()

