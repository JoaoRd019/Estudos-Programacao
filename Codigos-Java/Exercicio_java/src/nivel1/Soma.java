package nivel1;

public class Soma {
    public int somar(int a, int b){
        return a + b;
    }

    public boolean eMaiorDeIdade(int idade){
        return idade >= 18;
    }

    public double calcularDesconto(double preco, double desconto){
        return preco - desconto;
    }

    public void repetirTexto(String texto, int vezes){
        for (int i = 0; i < vezes; i++) {
            System.out.println(texto);

        }
    }






}
