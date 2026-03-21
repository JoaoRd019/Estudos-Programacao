package nivel3;

import java.util.Scanner;

public class Exercicio01Tabuada {

    static void main() {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = leitura.nextInt();

        for (int i = 1; i < 11; i++){
            int res = num * i;
            System.out.println(num+ " * "+ i+ " = "+ res);
        }
    }
}
