public class Produtos {

    private String nomeProduto;
    private double Preco;

    public Produtos(String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        Preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }
}
