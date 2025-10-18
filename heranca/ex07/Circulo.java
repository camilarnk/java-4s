package ex07;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Raio: %.2f\n", raio);
    }

}
