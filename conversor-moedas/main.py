taxa = 5.36

def real_para_dolar():
    real = float(input("Digite o valor em reais: "))
    return real / taxa

def dolar_para_real():
    dolar = float(input("Digite um valor em dolares: "))
    return dolar * taxa

print("-- Conversor de moedas --")
print("Escolha uma opção")
print("1. dolar para Real")
print("2. Real para Dolar")
opcao = input("Digite aqui (1 ou 2): ")

if opcao == "1":
    resultado = dolar_para_real()
    print("R$ {resultado:.2f}")

elif opcao == "2":
    resultado = real_para_dolar()
    print(f"$ {resultado:.2f}")

else:
    print(f"Opção inválida! Digite 1 ou 2.")