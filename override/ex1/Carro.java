package ex1;

public class Carro extends Veiculo {
    private double tarifaEspecifica = 12.00;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double calcularPedagio() {
        return tarifaEspecifica;
    }
    
}
