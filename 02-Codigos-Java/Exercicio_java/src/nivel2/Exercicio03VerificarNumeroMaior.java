package nivel2;

import java.util.Scanner;

public class Exercicio03VerificarNumeroMaior {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num1 = leitura.nextInt();

        System.out.println("Digite um numero");
        int num2 = leitura.nextInt();

        if (num1 > num2){
            System.out.println("O numero "+num1+ " é maior que o numero "+ num2);
        }else if (num2 > num1){
            System.out.println("O numero "+num2+ " é maior que o numero "+ num1);
        } else {
            System.out.println("Os numeros sao iguais");
        }
    }
}
