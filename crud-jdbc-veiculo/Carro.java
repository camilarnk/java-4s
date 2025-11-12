public class Carro extends Veiculo implements Tributavel {

    private int portas;

    public Carro(String modelo, double precoBase, int portas) {
        super(modelo, precoBase);
        this.portas = portas;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + (portas * 500);
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    @Override
    public double calcularImposto() {
        return getPrecoBase() * 0.07;
    }

}
