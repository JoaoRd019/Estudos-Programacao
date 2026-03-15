package contaBancaria;

public class Main {
    static void main() {
        Conta c1 = new Conta("Joao Pedro", "0000000000000", 0);

        System.out.println(c1);
        c1.depositar(100.00);
        System.out.println(c1);
        c1.sacar(50);
        System.out.println(c1);

        ContaPoupanca poupanca1 = new ContaPoupanca("Joao Pedro", "0000000000000", 0, 0.5);

    }
}
