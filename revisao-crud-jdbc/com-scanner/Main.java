import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

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

        ItemCRUD crud = new ItemCRUD();
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n ---- E-commerce NexCommerce ---- ");
            System.out.println("1 - Adicionar Item");
            System.out.println("2 - Listar Itens");
            System.out.println("3 - Atualizar Item");
            System.out.println("4 - Deletar Item");
            System.out.println("5 - Encerrar menu");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    ItemVendavel novoItem = crud.criarItem();
                    if (novoItem != null) {
                        storage.salvarItem(novoItem);
                    }
                    break;
                case 2:
                    List<String> itens = storage.buscarTodosItens();
                    crud.listarItens(itens);
                    break;
                case 3:
                    int idAtualizar = crud.solicitarIdAtualizacao();
                    double novoPreco = crud.solicitarNovoPreco();
                    storage.atualizarPrecoBase(idAtualizar, novoPreco);
                    break;
                case 4:
                    int idDeletar = crud.solicitarIdDelecao();
                    storage.deletarItem(idDeletar);
                    break;
            }
        } while (opcao != 5);
    }
}