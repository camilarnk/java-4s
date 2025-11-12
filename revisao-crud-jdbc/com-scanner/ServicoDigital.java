public class ServicoDigital extends ItemVendavel {

    private int duracaoMeses;

    public ServicoDigital(String nome, double precoBase, int duracaoMeses) {
        super(nome, precoBase);
        this.duracaoMeses = duracaoMeses;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * duracaoMeses;
    }

    @Override
    public String getTipo() {
        return "Digital";
    }

}