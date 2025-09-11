public class Musica {
    private double duracao;
    private String nome;

    public Musica(double duracao, String nome) {
        this.duracao = duracao;
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public String getNome() {
        return nome;
    }
}
