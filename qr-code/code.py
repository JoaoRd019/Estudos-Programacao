import qrcode

# Salva o QR code como uma imagem PNG chamada "qrcode.png"
qrcode.make("https://github.com/JoaoRd019").save("qrcode.png")