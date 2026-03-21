import random

# numero aleatorio entre 1 e 50
numero_secreto = random.randint(1,50)

print("--------------------------------------")
print("-- BEM VINDO AO JOGO DE ADIVINHAÇÃO --")
print("--------------------------------------\n")

tentativa = 1

# loop para o jogo de adivinhaçao
while(True):
    
    print("\nTente acertar o o numero secreto!")
    print("Voce tera 5 tentativas")
    print(f"Voce esta na tentativa numero: {tentativa} ")
    try:
        n1 = int(input("\nDigite o numero secreto de 1 a 50: "))
    except ValueError:
        print("Por favor digite um numero valido")
        continue
    
    if numero_secreto == n1:
        print("parabens voce acertou")
        break
    elif numero_secreto > n1:
        print("Oops! voce errou tente um numero maior")
    elif numero_secreto < n1:
        print("Oops! voce errou tente um numero menor ")
    
    tentativa += 1

    if tentativa == 5:
        print("Suas tentativas acabaram")
        print(f"O numero secreto era: {numero_secreto}")
        print("--------------------------------------")
        break