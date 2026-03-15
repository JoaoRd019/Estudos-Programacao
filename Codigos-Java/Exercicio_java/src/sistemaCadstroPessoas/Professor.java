package sistemaCadstroPessoas;

public class Professor extends Pessoa{
    private String materia;

    public Professor(String nome, int telefone, String endereco, String materia) {
        super(nome, telefone, endereco);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public void fichaPessoa() {
        System.out.println("** Ficha professor **");
        System.out.println("Nome: "+getNome()+ "| Telefone: "+getTelefone()+"| Endereço: "+ getEndereco()+"| Materia: "+ getMateria());

    }
}
