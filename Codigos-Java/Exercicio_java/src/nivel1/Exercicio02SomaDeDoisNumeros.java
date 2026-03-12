package nivel1;

import java.util.Scanner;

public class Exercicio02SomaDeDoisNumeros {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero1 = leitura.nextInt();

        System.out.println("Digite outro numero");

        int numero2 = leitura.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("Soma dos numeros: " + numero1 + " + "+ numero2+ " = "+ resultado);
    }
}
