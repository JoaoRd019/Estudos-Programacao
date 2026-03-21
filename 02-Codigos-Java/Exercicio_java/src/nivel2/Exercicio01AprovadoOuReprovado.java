package nivel2;

import java.util.Scanner;

public class Exercicio01AprovadoOuReprovado {
    static void main() {
        Scanner leitura = new Scanner(System.in);



        System.out.print("Digite tres nota:");
        double nota1 = leitura.nextDouble();
        double nota2 = leitura.nextDouble();
        double nota3 = leitura.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media > 5){
            System.out.println("Reuperação");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("notas: "+nota1+", "+nota2+", "+nota3);

        System.out.print("Media: "+ media);




    }
}
