package SistemaBibliotecaLivro;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> listaDeLivros = new ArrayList<>();
    private ArrayList<Livro> livrosLidos = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        listaDeLivros.add(livro);
    }

    public void listarLivros(){
        if (listaDeLivros.isEmpty()){
            System.out.println("Não tem livros registrado");
        } else {
            for (Livro l: listaDeLivros){
                System.out.println(l.toString());
            }
        }
    }

    public void listarLivrosLidos(){
        if (livrosLidos.isEmpty()){
            System.out.println("Voce ainda nao leu nenhum livro.");
        }else {
            for (Livro l: livrosLidos){
                System.out.println(l.toString());
            }
        }
    }

    public int totalPaginasLidas(){
        int soma = 0;
        for (Livro l: livrosLidos){
            soma += l.getPaginas();
        }
        return soma;
    }

    public void marcarLivroComoLido(String titulo){
        if (listaDeLivros.isEmpty()){
            System.out.println("Não tem livros registrado");
        } else {
            for (Livro l: listaDeLivros){
                if (l.getTitulo().equals(titulo)){
                    livrosLidos.add(l);

                }
            }


        }
    }

}
