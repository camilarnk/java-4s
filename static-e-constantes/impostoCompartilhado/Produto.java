package impostoCompartilhado;

public class Produto {
    private String nome;
    private double preco;
    private static double taxaImposto = 0.05;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPrecoComImposto() {
        return this.preco * (1 + taxaImposto);
    }

    public static void setTaxaImposto(double novaTaxa) {
        taxaImposto = novaTaxa;
    }

    public void exibirPrecos() {
        System.out.printf("%s - R$%.2f - Preço c/ imposto: R$%.2f\n",
        this.nome, this.preco, getPrecoComImposto());
    }

}
