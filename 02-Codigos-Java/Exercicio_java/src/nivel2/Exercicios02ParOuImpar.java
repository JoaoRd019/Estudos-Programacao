package nivel2;

import java.util.Scanner;

public class Exercicios02ParOuImpar {
    static void main() {
        System.out.print("Digite um numero: ");
        Scanner leitura = new Scanner(System.in);
        int numero = leitura.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero "+ numero+ " é par");
        }else {
            System.out.println("O numero "+numero+ " é impar");
        }
    }
}
