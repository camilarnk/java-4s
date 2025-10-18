package ex04;

public class Movel extends Produto {
    private String material;
    private String cor;

    public Movel(int id, String nome, double preco, String material, String cor) {
        super(id, nome, preco);
        this.material = material;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("- Material: %s - Cor: %s", material, cor);
    }

}