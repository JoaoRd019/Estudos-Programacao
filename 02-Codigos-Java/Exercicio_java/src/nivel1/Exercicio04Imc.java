package nivel1;

import java.util.Scanner;

public class Exercicio04Imc {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu peso:");
        double peso = leitura.nextDouble();

        System.out.print("Digite sua altura:");
        double altura = leitura.nextDouble();


        double imc = peso / (altura * altura);

        System.out.println(imc);
    }
}
