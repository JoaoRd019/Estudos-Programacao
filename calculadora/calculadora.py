#calculadora

# funçoes que retorna o operador utilizado 
def adicao(a, b):
    return a + b
def subtracao(a, b):
    return a - b
def multiplicacao(a, b):
    return a * b 
def divisao(a, b):
    return a / b

# funçao para receber numeros para ser feito a operaçao utiliza o loop while caso o usurio digitar algo inesperado e nao encerrar o programa
def pegar_numero(a, b):
    while True:
        try:   
            a = int(input("Digite um numero: "))
            b = int(input("Digite o segumdo numero: "))
            return a,b
        except ValueError:
            print("Digite um numero valido")

def variaveis(a, b ):
    return a ,b
        
# menu de exibiçao 
print("-- Calculadora -- ")
print("Escolha uma operação")
print("1. Adição (+)")
print("2. Subtração (-)")
print("3. Multiplicação (*)")
print("4. Divisão (/)")
opcao = int(input("Digite aqui: "))

# estruturas de condiçao
if opcao == 1:
    n1, n2 =  pegar_numero(...)
    soma = adicao(n1, n2)
    print(f"{n1} + {n2} =", soma)

elif opcao == 2:
    n1, n2 =  pegar_numero()
    menos = subtracao(n1, n2)
    print(f"{n1} - {n2} =", menos)

elif opcao == 3:
    n1, n2 =  pegar_numero()
    mult = multiplicacao(n1, n2)
    print(f"{n1} * {n2} =", mult)

elif opcao == 4:
    n1, n2 =  pegar_numero()
    div = divisao(n1, n2)
    print(f"{n1} / {n2} =", div)
