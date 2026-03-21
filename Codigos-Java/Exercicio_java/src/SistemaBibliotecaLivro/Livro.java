package SistemaBibliotecaLivro;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private String genero;
    private static int contador;
    private static int id;

    public Livro(String titulo,String autor, int paginas, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Nome: " + getTitulo() + " | Autor: " + getAutor() + " | Paginas: " + getPaginas() + " | Genero: " + getGenero();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Livro.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Livro.contador = contador;
    }
}
