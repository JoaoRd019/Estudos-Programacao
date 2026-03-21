import random
# Gerar uma lista de 10 numeros aleatorios entre 1 e 100
lista = [random.randint(1, 100) for i in range(10)]

# separar numeros pares e impares
numeros_pares = []
numeros_impares = []

print("\nLista de numeros:",lista)

# percorrer a lista e separar os numeros pares e impares nas listas 
for i in lista:
    if i % 2 == 0:
        numeros_pares.append(i)
    else:
         numeros_impares.append(i)
                
print("Numeros pares: ", numeros_pares)
print("Numeros impares: ", numeros_impares)