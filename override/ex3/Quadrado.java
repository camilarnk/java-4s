package ex3;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        super();
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
