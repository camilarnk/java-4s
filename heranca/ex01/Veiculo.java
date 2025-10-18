package ex01;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String toString() {
        return String.format("Marca: %s - Modelo: %s - Ano: %d", marca, modelo, ano);
    }

}
