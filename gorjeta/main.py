valor_conta = float(input("Digite o valor da conta para calcular a gorjeta: "))

print("\nEscolha a porcentagem da gorjeta")
print("1. Gorjeta 10%")
print("2. Gorjeta 15%")
print("3. Gorjeta 20%")
opcao = input("- Digite aqui: ")

def mensagem(valor_conta, conta):
    print(f"\nValor da conta: R$ {valor_conta:.2f}")
    print(f"Valor da gorjeta: R$ {conta:.2f}")
    print(f"Total a pagar: R$ {valor_conta + conta:.2f}")

if opcao == "1":
    conta = valor_conta * 0.1
    mensagem()
elif opcao == "2":
    conta = valor_conta * 0.15
    mensagem()
elif opcao == "3":
    conta = valor_conta * 0.2
    mensagem()
else:
    print("Digite uma opção válida")