package impostoCompartilhado;

/* 2. e 3. Imposto Compartilhado: Crie uma classe Produto. Todo Produto tem um private double preco.
A loja tem uma taxa de imposto que é a mesma para todos os produtos. Crie um atributo private static
double taxaImposto = 0.05; (representando 5%). Crie um método de instância public double
getPrecoComImposto() que retorna this.preco * (1 + taxaImposto). Crie um método estático
public static void setTaxaImposto(double novaTaxa). No main, crie dois produtos, exiba seus preços
com imposto. Em seguida, chame Produto.setTaxaImposto(0.10);. Exiba novamente os preços com
imposto dos dois produtos para provar que a alteração da variável estática afetou ambos. */

public class Main {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Banana", 5.00);
        Produto produto2 = new Produto("Morango", 8.00);

        produto1.exibirPrecos();
        produto2.exibirPrecos();

        Produto.setTaxaImposto(0.10);

        System.out.printf("\nProdutos com a taxa de imposto atualizada:\n");
        produto1.exibirPrecos();
        produto2.exibirPrecos();

    }
}
