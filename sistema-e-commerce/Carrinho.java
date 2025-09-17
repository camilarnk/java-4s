import java.util.ArrayList;

public class Carrinho {
    private Cliente cliente;
    private ArrayList<ItemCarrinho> itens = new ArrayList<>();

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new ItemCarrinho(produto, quantidade));
        System.out.printf("\n+%d %s adicionado ao carrinho\n", quantidade, produto.getNome());
    }

    public void removerItem(String nomeProduto) {

        boolean removido = this.itens.removeIf(item -> item.getProduto().getNome().equals(nomeProduto));

        if(removido) {
            System.out.printf("\n%s removido do carrinho\n", nomeProduto);
        } else {
            System.out.printf("\n%s não encontrado no carrinho\n", nomeProduto);
        }

    }

    public void calcularTotal() {
        double soma = 0;
        for (ItemCarrinho item : itens) {
            soma += item.calcularSubtotal();
        }
        System.out.printf("\nValor total no carrinho: %.2f\n", soma);
    }

    public void listarItens() {

        System.out.printf("\nCarrinho de Compras\nDados do Comprador: %s, CPF %s\n",
        this.cliente.getNome(), this.cliente.getCpf());
        int i = 1;

        for (ItemCarrinho item : itens) {
            System.out.printf("\n%d. %s - R$%.2f cada\nQt: %d - Subtotal R$%.2f\n",
            i, item.getProduto().getNome(), item.getProduto().getPreco(),
            item.getQuantidade(), item.calcularSubtotal());

            i++;
        }
    }

}