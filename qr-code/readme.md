# Gerador de QR Code

Programa Python para gerar QR codes a partir de URLs ou texto.

## Como Usar

1. Instale a biblioteca:
```bash
pip install qrcode[pil]
```

2. Execute o programa:
```bash
python code.py
```

3. O QR code será salvo como `qrcode.png`

## Personalizar

Para gerar um QR code diferente, altere a URL no código:

```python
qrcode.make("sua_url_aqui").save("qrcode.png")
```

## Exemplos

```python
# Site
qrcode.make("https://www.seusite.com").save("qrcode.png")

# WhatsApp
qrcode.make("https://wa.me/5511999999999").save("qrcode.png")

# Texto
qrcode.make("Olá, Mundo!").save("qrcode.png")
```

## Requisitos

- Python 3.x
- Biblioteca `qrcode`