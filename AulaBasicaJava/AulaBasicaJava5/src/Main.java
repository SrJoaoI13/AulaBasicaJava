import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Pessoas p1 = new Pessoas("Morta Deda", 25);
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite Seu nome: ");
        String nome = ler.next();;

        System.out.printf("Digite sua idade: ");
        int idade = ler.nextInt();

        Pessoas p1 = new Pessoas(nome,idade);

        System.out.printf("\n=== Clientes ===\n");
        System.out.printf("Nome: "  +p1.getNome() +"\n");
        System.out.printf("Idade: " +p1.getIdade() +"\n");

//Produtos

        Produtos pr1 = new Produtos("Geladeira 700L",7865.58);

        System.out.printf("\n=== Produtos ===\n");
        System.out.printf("Nome do Produto: " +pr1.getNomeProduto() +"\n");
        System.out.printf("Valor do Produto: " +pr1.getPreco());
    }
}