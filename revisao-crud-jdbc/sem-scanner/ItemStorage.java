import org.h2.command.Prepared;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemStorage {

    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS item (" +
                " id INT AUTO_INCREMENT PRIMARY KEY," +
                " nome VARCHAR(255) NOT NULL," +
                " preco_base DOUBLE," +
                " tipo VARCHAR(50)," +
                " preco_final DOUBLE," +
                " imposto DOUBLE" +
                ");";

        try(Connection conexao = ConexaoBanco.getConexao();
            Statement veiculo = conexao.createStatement()
        ) {
            veiculo.execute(sql);
            System.out.println("Tabela 'item' criada!");

        } catch (SQLException erro) {
            System.out.println("Erro ao tentar criar tabela" + erro.getMessage());
        }
    }

    public void salvarItem(ItemVendavel item) {
        String sql = "INSERT INTO item (nome, preco_base, tipo, preco_final, imposto)" +
                "VALUES (?, ?, ?, ?, ?);";
        // os '?' sao para ter segurança usando o PrepareStatement colocando as informaçoes

        try(Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement veiculo = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ){
            veiculo.setString(1, item.getNome());
            veiculo.setDouble(2, item.getPrecoBase());
            veiculo.setString(3, item.getTipo());
            veiculo.setDouble(4, item.calcularPrecoFinal());
            veiculo.setDouble(5, item.calcularImposto());

            veiculo.executeUpdate();

            ResultSet chavesGeradas = veiculo.getGeneratedKeys();
            if (chavesGeradas.next()) {
                item.setId(chavesGeradas.getInt(1));
            }

            System.out.println("Item salvo na tabela");

        } catch (SQLException erro) {
            System.out.println("Erro ao salvar item na tabela" + erro.getMessage());
        }
    }

    public List<ItemVendavel> buscarTodosItens() {
        List<ItemVendavel> itensSalvos = new ArrayList<>();

        String sql = "SELECT * FROM item";

        try (Connection conexao = ConexaoBanco.getConexao();
             PreparedStatement veiculo = conexao.prepareStatement(sql)
        ) {
            ResultSet result = veiculo.executeQuery();

            while(result.next()) { // pegando as informaçoes
                int id = result.getInt("id");
                String tipo = result.getString("tipo");
                String nome = result.getString("nome");
                double precobase = result.getDouble("preco_base");

                ItemVendavel item; // polimofismo, criando um item

                if(tipo.equalsIgnoreCase("Fisico")) {
                    item = new ProdutoFisico(nome, precobase, 1.0);
                    item.setId(id);
                } else {
                    item = new ServicoDigital(nome, precobase, 1);
                    item.setId(id);
                }

                itensSalvos.add(item);
            }

        } catch (SQLException erro) {
            System.out.println("Erro ao buscar itens" + erro.getMessage());
        }
        return itensSalvos;
    }

    public void atualizarPrecoBase(int id, double novoPrecoBase) {
        String sql = "UPDATE item SET preco_base = ? WHERE id = ?";

        try (Connection conexao = ConexaoBanco.getConexao();
             PreparedStatement veiculo = conexao.prepareStatement(sql)
        ) {
            veiculo.setDouble(1, novoPrecoBase);
            veiculo.setInt(2, id);

            int linhasAfetadas = veiculo.executeUpdate();
            if(linhasAfetadas > 0) {
                System.out.println("Preço base atualizado");
            } else {
                System.out.println("Item nao encontrado na tabela");
            }

        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar preço base" + erro.getMessage());
        }
    }

    public void deletarItem(int id) {
        String sql = "DELETE FROM item WHERE id = ?";

        try (Connection conexao = ConexaoBanco.getConexao();
             PreparedStatement veiculo = conexao.prepareStatement(sql)
        ) {
            veiculo.setInt(1, id);

            int linhasAfetadas = veiculo.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Item deletado com sucesso!");
            } else {
                System.out.println("Nenhum item encontrado com o ID informado.");
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao deletar item" + erro.getMessage());
        }
    }

    public void deletarTodosItens() {
        String sql = "DELETE FROM item";
        try (Connection conexao = ConexaoBanco.getConexao();
             Statement stmt = conexao.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabela limpa com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao limpar tabela: " + e.getMessage());
        }
    }

}