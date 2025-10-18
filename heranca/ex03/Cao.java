package ex03;

public class Cao extends Animal {
    private String raca;

    public Cao(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("- Raça: %s", raca);
    }

}