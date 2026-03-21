package nivel3;

import java.util.Scanner;

public class Exercicio02ContagemRegressiva {
    static void main() {
        Scanner leitura= new Scanner(System.in);

        System.out.println("Digite um numero");

        int num = leitura.nextInt();

        while (true){
            System.out.println(num--);
            if (num == -1){
                break;
            }
        }

    }
}
