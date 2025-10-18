package ex07;

public class FormaGeometrica {
    private String cor;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Cor: %s - ", cor);
    }
    
}
