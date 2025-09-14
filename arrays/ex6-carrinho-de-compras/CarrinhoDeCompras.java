import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Livro> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Livro livro) {
        itens.add(livro);
        System.out.printf("Livro %s adicionado ao carrinho\n", livro.getTitulo());
    }

    public void removerItem(Livro livro) {
        if(itens.remove(livro)){
            System.out.printf("Livro %s removido do carrinho\n", livro.getTitulo());
        }else{
            System.out.println("Livro não encontrado no carrinho");
        }
    }

    public void listarItens() {
        if(itens.isEmpty()){
            System.out.println("O carrinho está vazio");
        }else{
            System.out.println("---------------------------------------");
            System.out.println("Livros no carrinho:");
            // tipo, elemento qualquer, array a percorrer
            for(Livro livro : itens) {
                System.out.printf("Título: %s \nAutor: %s \nPreço: %.2f\n",
                livro.getTitulo(), livro.getAutor(), livro.getPreco());
            }
            System.out.println("---------------------------------------");
        }
    }

    public void calcularTotal() {
        double total = 0;
        for(Livro livro : itens) {
            total += livro.getPreco();
        }
        System.out.printf("Preço total: %.2f", total);
    }

}

