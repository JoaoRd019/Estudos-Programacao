package SistemaBibliotecaLivro;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        Biblioteca b1 = new Biblioteca();


        String menu = """
                ***************************
                1 - Adicionar livro a estante
                2 - marcar livro como lido
                3 - Listar livro
                4 - listar livros lidos
                5 - Genero favorito
                6 - Total paginas lidas
                7 - sair
                *****************************
                Escolha uma opção: """;
        boolean rodando = true;

        while (rodando){
            System.out.print(menu);
            int opcao = Integer.parseInt(leitura.nextLine());

            switch (opcao){
                case 1 -> {
                    System.out.println("TITULO: ");
                    String titulo= leitura.nextLine();
                    System.out.println("AUTOR: ");
                    String autor = leitura.nextLine();
                    System.out.println("PAGINAS: ");
                    int paginas = Integer.parseInt(leitura.nextLine());
                    System.out.println("GENERO: ");
                    String genero = leitura.nextLine();
                    Livro l1 = new Livro(titulo, autor, paginas, genero);
                    b1.adicionarLivro(l1);
                    System.out.println("Livro: " + titulo + " adicionado a estante.");
                }
                case 2 ->{
                    System.out.println("Digite o titulo do livro: ");
                    String titulo = leitura.nextLine();
                    b1.marcarLivroComoLido(titulo);

                }
                case 3 ->{
                    System.out.println("Livros na estante.");
                    b1.listarLivros();
                }
                case 4 -> {
                    System.out.println("Livros lidos");
                    b1.listarLivrosLidos();
                }
                case 5 ->{

                }
                case 6 -> {
                    System.out.println("Paginas lidas: " + b1.totalPaginasLidas());
                }
                case 7 ->{
                    rodando = false;
                    System.out.println("Ate logo...");
                    break;
                }
                default -> {
                    System.out.println("Digite um numero valido.");
                }

            }
        }
    }
}
