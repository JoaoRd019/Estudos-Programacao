import random
import string

tamanho = input("""
Escolha o tamanho da senha:
1. 6 dígitos
2. 7 dígitos
3. 8 dígitos
:""")

# Define caracteres possíveis
caracteres = string.ascii_letters + string.digits + "!@#$%&*?"

# Converte opção em quantidade
if tamanho == "1":
    qtd = 6
elif tamanho == "2":
    qtd = 7
elif tamanho == "3":
    qtd = 8
else:
    print("Opção inválida.")

# Gera a senha
senha = "".join(random.choice(caracteres) for i in range(qtd))

print(f"\nSua senha gerada é: {senha}")
