package contaBancaria.classes;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String nome, String cpf, double saldo,double limiteChequeEspecial) {
        super(nome, cpf, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public double sacar(double valor) {
        if (valor > getSaldo() + limiteChequeEspecial){
            System.out.println("Valor excedido");
            return getSaldo();
        }
        setSaldo(getSaldo() - valor);
        return getSaldo();
    }
}
