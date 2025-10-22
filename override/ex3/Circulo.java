package ex3;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
