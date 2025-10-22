package ex1;

public class Veiculo {
    private String marca;
    private String modelo;
    private double tarifaBase = 10.50;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public double calcularPedagio() {
        return tarifaBase;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

}