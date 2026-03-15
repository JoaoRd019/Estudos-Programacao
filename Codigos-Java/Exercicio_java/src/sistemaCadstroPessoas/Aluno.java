package sistemaCadstroPessoas;

public class Aluno extends Pessoa{
    private boolean matricula;
    private int ra;

    public Aluno(String nome, int telefone, String endereco, boolean matricula, int ra) {
        super(nome, telefone, endereco);
        this.matricula = matricula;
        this.ra = ra;
    }

    @Override
    public void fichaPessoa() {
        System.out.println("** Ficha do aluno **");
        System.out.println("Nome: "+getNome()+ "| Telefone: "+getTelefone()+"| Endereço: "+ getEndereco()+ " | Matriculado: "+ isMatricula()+ " | RA: "+ getRa());
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
