package ex07;

public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Base: %.2f - Altura: %.2f\n", base, altura);
    }
    
}
