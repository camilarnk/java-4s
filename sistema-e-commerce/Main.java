public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Maria", "23132132131");

        Produto produto1 = new Produto("Shampoo", 19.00);
        Produto produto2 = new Produto("Condicionador", 15.00);
        Produto produto3 = new Produto("Cebola", 2.00);
        Produto produto4 = new Produto("Macarrão", 5.00);
        Produto produto5 = new Produto("Tomate", 4.00);

        Carrinho carrinho1 = new Carrinho(cliente1);

        carrinho1.adicionarItem(produto1, 1);
        carrinho1.adicionarItem(produto2, 1);
        carrinho1.adicionarItem(produto3, 8);
        carrinho1.adicionarItem(produto4, 4);
        carrinho1.adicionarItem(produto5, 10);

        carrinho1.listarItens();
        carrinho1.calcularTotal();

        carrinho1.removerItem("Condicionador");

        carrinho1.listarItens();
        carrinho1.calcularTotal();

    }

}