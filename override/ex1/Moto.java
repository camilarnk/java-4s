package ex1;

public class Moto extends Veiculo {
    private double tarifaEspecifica = 6.00;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double calcularPedagio() {
        return tarifaEspecifica;
    }
}
