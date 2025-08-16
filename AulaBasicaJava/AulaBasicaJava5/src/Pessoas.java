public class Pessoas {
    //Atributos da classe
    private String nome;
    private int idade;

    // Contructor

    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Metados da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
