package nivel1;

import java.util.Scanner;

public class Exercicio01OlaMundo {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome");

        String nome = leitura.nextLine();

        System.out.println("Olá "+ nome);


    }


}
