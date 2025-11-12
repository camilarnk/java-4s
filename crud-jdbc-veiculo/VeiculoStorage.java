import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeiculoStorage {

    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS veiculo (\n" +
                "  id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                "  modelo VARCHAR(255) NOT NULL,\n" +
                "  preco_base DOUBLE,\n" +
                "  tipo VARCHAR(50),\n" +
                "  preco_final DOUBLE,\n" +
                "  imposto DOUBLE\n" +
                ");";

        try (Connection conexao = ConexaoBanco.getConexao();
            Statement veiculo = conexao.createStatement();
        ) {
            veiculo.execute(sql);
            System.out.println("Tabela criada!");
        } catch (SQLException erro)  {
            System.out.println("Erro ao criar tabela" + erro.getMessage());
        }
    }

    public void salvarVeiculo(Veiculo veiculo) {
        String sql = "INSERT INTO veiculo (modelo, preco_base, tipo, preco_final, imposto)" +
                "VALUES (?, ?, ?, ?, ?);";

        try (Connection conexao = ConexaoBanco.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ) {
            ps.setString(1, veiculo.getModelo());
            ps.setDouble(2, veiculo.getPrecoBase());
            ps.setString(3, veiculo.getTipo());
            ps.setDouble(4, veiculo.calcularPrecoFinal());
            ps.setDouble(5, veiculo.calcularImposto());

            ps.executeUpdate();

            ResultSet pk = ps.getGeneratedKeys();
            if(pk.next()) {
                veiculo.setId(pk.getInt(1));
            }
            System.out.println("Veiculo salvo na tabela!");

        } catch (SQLException erro) {
            System.out.println("Erro ao inserir veiculo" + erro.getMessage());
        }
    }

    public List<Veiculo> buscarTodosVeiculos() {
        List<Veiculo> listaVeiculos = new ArrayList<>();

        String sql = "SELECT * FROM veiculo";

        try (Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
        ) {
            ResultSet cursor = ps.executeQuery();

            while(cursor.next()) {
                int id = cursor.getInt("id");
                String modelo = cursor.getString("modelo");
                double preco_base = cursor.getDouble("preco_base");
                String tipo = cursor.getString("tipo");

                Veiculo veiculo;

                if(tipo.equalsIgnoreCase("Carro")) {
                    veiculo = new Carro(modelo, preco_base, 4);
                } else {
                    veiculo = new Moto(modelo, preco_base, 150);
                }

                veiculo.setId(id);
                listaVeiculos.add(veiculo);
            }

        } catch (SQLException erro) {
            System.out.println("Erro ao buscar veiculos na tabela" + erro.getMessage());
        }
        return listaVeiculos;
    }

    public void atualizarPrecoBase(int id, double novoPrecoBase) {
        String sql = "UPDATE veiculo SET preco_base = ? WHERE id = ?;";

        try (Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement ps = conexao.prepareStatement(sql)
        ) {
            ps.setDouble(1, novoPrecoBase);
            ps.setInt(2, id);

            if(ps.executeUpdate() > 0) {
                System.out.println("Veiculo atualizado");
            } else {
                System.out.println("Veiculo nao encontrado na tabela");
            }

        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar veiculo" + erro.getMessage());
        }
    }

    public void deletarVeiculo(int id) {
        String sql = "DELETE FROM veiculo WHERE id = ?;";

        try (Connection conexao = ConexaoBanco.getConexao();
            PreparedStatement ps = conexao.prepareStatement(sql)
        ) {
           ps.setInt(1, id);

           if(ps.executeUpdate() > 0) {
               System.out.println("Veiculo deletado");
           } else {
               System.out.println("Veiculo nao encontrado na tabela");
           }

        } catch (SQLException erro) {
            System.out.println("Erro ao deletar veiculo" + erro.getMessage());
        }

    }

}
