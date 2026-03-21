package sistemaCadstroPessoas;

public class Main {
    static void main() {

        Pessoa p1 = new Pessoa("João Pedro", 12345678, "Av. Brasil Sp");
        Aluno a1 = new Aluno("João Pedro", 12345678, "Av. Brasil Sp", false, 544);
        Professor professor1 = new Professor("Mario", 9876543, "Faria Lima SP", "Portugues");

        Pessoa[] pessoas = { p1, a1, professor1 };

        for (Pessoa p : pessoas) {
            p.fichaPessoa();
        }
    }

}
