import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ItemStorage storage = new ItemStorage();
        storage.criarTabela();

        try (Connection conexao = ConexaoBanco.getConexao()) {
            if (conexao != null) {
                System.out.println("Conectado com o banco de dados!");
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao tentar conectar com o banco de dados.");
            System.out.println(erro.getMessage());
        }

        ProdutoFisico produto1 = new ProdutoFisico("Notebook", 5000.00, 3);
        ProdutoFisico produto2 = new ProdutoFisico("Mouse", 400, 0.2);
        ServicoDigital servico1 = new ServicoDigital("Assinatura Premium", 45.00, 12);
        ServicoDigital servico2 = new ServicoDigital("Curso Online", 250, 3);

        System.out.println("\n ==== Cadastrando itens ====");
        storage.salvarItem(produto1);
        storage.salvarItem(produto2);
        storage.salvarItem(servico1);
        storage.salvarItem(servico2);

        System.out.println("\n ==== Buscando itens da tabela ====");
        List<ItemVendavel> itensOriginais = storage.buscarTodosItens();
        for (ItemVendavel item : itensOriginais) {
            System.out.printf("ID: %d - Tipo: %s - Nome: %s - Preço base: %.2f - Preço final: %.2f - Imposto: %.2f\n",
                    item.getId(), item.getTipo(), item.getNome(), item.getPrecoBase(), item.calcularPrecoFinal(), item.calcularImposto()
            );
        }

        System.out.println("\n ==== Atualizando preço base ====");
        storage.atualizarPrecoBase(23, 4500.00);

        System.out.println("\n ==== Deletando item ====");
        storage.deletarItem(24);

        System.out.println("\n ==== Buscando itens atualizado ====");
        List<ItemVendavel> itensAtualizados = storage.buscarTodosItens();
        for (ItemVendavel item : itensAtualizados) {
            System.out.printf("Tipo: %s - Nome: %s - Preço base: %.2f - Preço final: %.2f - Imposto: %.2f\n",
                    item.getTipo(), item.getNome(), item.getPrecoBase(), item.calcularPrecoFinal(), item.calcularImposto()
            );
        }

    }
}