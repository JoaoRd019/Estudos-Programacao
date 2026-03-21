package nivel1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03MediaDeTresNotas {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma nota");
        int nota1 = leitura.nextInt();
        System.out.println("Digite  a segunda nota");
        int nota2 = leitura.nextInt();
        System.out.println("Digite a terceira nota");
        int nota3 = leitura.nextInt();

        int somaNotas = nota1 + nota2 + nota3;

        double media = (double) somaNotas / 3;

        System.out.println("Notas: " + nota1 + nota2 + nota3);
        System.out.println("Media: "+ media);








    }
}
