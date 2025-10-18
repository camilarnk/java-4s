package ex04;

public class Eletronico extends Produto {
    private int voltagem;
    private int garantiaEmMeses;

    public Eletronico(int id, String nome, double preco, int voltagem, int garntiaEmMeses) {
        super(id, nome, preco);
        this.voltagem = voltagem;
        this.garantiaEmMeses = garntiaEmMeses;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("- Voltagem: %dV - Garantia: %d meses", voltagem, garantiaEmMeses);
    }

}