package contaBancaria;

public class Conta {
    private String nome;
    private String cpf;
    private double saldo;


    public Conta(String nome, String cpf, double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Nome: "+ getNome()+" | CPF: "+getCpf()+ " | Saldo: R$ "+getSaldo();
    }

    public double depositar(double valor){
        return saldo +=  valor;
    }

    public double sacar(double valor){
        if (saldo < valor){
            System.out.println("Saldo insuficiente");
            return saldo;
        }
        return  saldo -= valor;
    }
    public void transferir(Conta destino, double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.sacar(valor);
        destino.depositar(valor);

    }
}
