import random

lista = [random.randint(1, 100) for i in range(10)]
numeros_pares = []
numeros_impares = []

print("\nLista de numeros:",lista)

for i in lista:
    if i % 2 == 0:
        numeros_pares.append(i)
    else:
         numeros_impares.append(i)
                
print("Numeros pares: ", numeros_pares)
print("Numeros impares: ", numeros_impares)