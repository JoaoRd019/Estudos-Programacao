package contaBancaria.classes;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;
    public ContaPoupanca(String nome, String cpf, double saldo, double taxaRendimento) {
        super(nome, cpf, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public double depositar(double valor) {
        double valorFinal = valor + (valor * taxaRendimento);
        return super.depositar(valorFinal);
    }
}
