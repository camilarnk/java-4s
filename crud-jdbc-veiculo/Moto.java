public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String modelo, double precoBase, int cilindradas) {
        super(modelo, precoBase);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + (cilindradas * 0.1);
    }

    @Override
    public String getTipo() {
        return "Moto";
    }

}
