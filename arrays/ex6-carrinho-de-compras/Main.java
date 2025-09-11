public class Main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Sistemas Operacionais Modernos", "Tanenbaum", 200.00);
        Livro livro2 = new Livro("Sistemas Operacionais Modernos 2", "Tanenbaum", 220.00);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem(livro1);
        carrinho.adicionarItem(livro2);

        carrinho.listarItens();
        carrinho.calcularTotal();

    }
}