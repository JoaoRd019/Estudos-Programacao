package nivel2;

import java.util.Scanner;

public class Exercicio04ClassificarImc {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu peso:");
        double peso = leitura.nextDouble();

        System.out.print("Digite sua altura:");
        double altura = leitura.nextDouble();


        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
