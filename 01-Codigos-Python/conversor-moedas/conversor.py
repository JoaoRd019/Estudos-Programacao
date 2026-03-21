taxa = 5.36

# conversao de real para dolar
def real_para_dolar():
    real = float(input("Digite o valor em reais: "))
    return real / taxa

# conversao de dolar para real
def dolar_para_real():
    dolar = float(input("Digite um valor em dolares: "))
    return dolar * taxa

# menu de exibiçao
print("-- Conversor de moedas --\n")
print("Escolha uma opção")
print("1. dolar para Real")
print("2. Real para Dolar")
opcao = int(input("Digite aqui (1 ou 2): "))

# funçao para exibir o resultado e evitar repetiçao de codigo
def exibir_resultado(moeda, valor):
    print(f"O valor convertido é: {moeda} {valor:.2f} \n")

if opcao == 1:
    resultado = dolar_para_real()
    exibir_resultado("R$", resultado)

elif opcao == 2:
    resultado = real_para_dolar()
    exibir_resultado("$$", resultado)
else:
    print(f"Opção inválida! Digite 1 ou 2.")