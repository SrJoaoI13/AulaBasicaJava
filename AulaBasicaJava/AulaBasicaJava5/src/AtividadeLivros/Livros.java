package AtividadeLivros;

public class Livros {
    String Titulo;
    String Autor;
    int numerosDePaginas;
    double Preco;

    public Livros(String titulo, String autor, int numerosDePaginas, double preco) {
        Titulo = titulo;
        Autor = autor;
        this.numerosDePaginas = numerosDePaginas;
        Preco = preco;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumerosDePaginas() {
        return numerosDePaginas;
    }

    public void setNumerosDePaginas(int numerosDePaginas) {
        this.numerosDePaginas = numerosDePaginas;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }
}
