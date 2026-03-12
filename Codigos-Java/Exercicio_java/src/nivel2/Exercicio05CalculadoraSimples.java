package nivel2;

import java.util.Scanner;

public class Exercicio05CalculadoraSimples {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = leitura.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = leitura.nextInt();


        System.out.println("""
                Escolhe um sinal
                1- Adição (+)
                2- Subtração (-)
                3- Multiplicação (*)
                4- Divisao (/)
                """);
        int menu = leitura.nextInt();



        if (menu == 1){
            System.out.println("Resultado: "+ (num1 + num2));
        }else if (menu == 2) {
            System.out.print("Resultado: "+ (num1 - num2));
        } else if (menu == 3) {
            System.out.println("Resultado: "+num1 * num2);

        } else if (menu == 4) {
            System.out.println("Resultado: "+num1 / num2);
        }

    }
}