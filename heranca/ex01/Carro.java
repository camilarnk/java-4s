package ex01;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " - N° de Portas: %d", numeroDePortas);
    }

}