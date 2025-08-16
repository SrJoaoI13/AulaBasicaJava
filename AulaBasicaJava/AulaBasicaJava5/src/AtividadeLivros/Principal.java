package AtividadeLivros;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite o titulo do livro: ");
        String Titulo = ler.next();

        System.out.printf("Digite o nome do autor: ");
        String autor = ler.next();

        System.out.printf("Digite o numero de paginas: ");
        int numerosDePaginas = ler.nextInt();

        System.out.printf("Digite o preco do livro: ");
        double preco = ler.nextDouble();

        Livros L1 = new Livros(Titulo, autor, numerosDePaginas, preco);

        Livros L2 = new Livros("Harry Potter e a camera secreta", "JOJO",800,152.87);

        System.out.printf("\n=== Livros ===");

        System.out.printf("\nTitulo: " +L1.getTitulo() +"\n");
        System.out.printf("Autor: " +L1.getAutor() +"\n");
        System.out.printf("Numero de Paginas: " +L1.getNumerosDePaginas() +"\n");
        System.out.printf("Preço: " +L1.getPreco() +"\n");


        System.out.printf("\nTitulo: " +L2.getTitulo() +"\n");
        System.out.printf("Autor: " +L2.getAutor() +"\n");
        System.out.printf("Numero de Paginas: " +L2.getNumerosDePaginas() +"\n");
        System.out.printf("Preço: " +L2.getPreco() +"\n");
    }
}
