package nivel3;

import java.util.Scanner;

public class Exercicio03SomaDeNNumeros {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a quantidade de vezes que deseja somar: ");

        int quantideDeNumeros = leitura.nextInt();
        int soma = 0;
        int contador = 0;


        while (true){
            System.out.print("Digite um nomero para somar: ");
            int num = leitura.nextInt();
            System.out.println(num);
            soma += num;
            contador++;

            if (quantideDeNumeros == contador){
                break;
            }
        }

        System.out.println(soma);
    }
}
