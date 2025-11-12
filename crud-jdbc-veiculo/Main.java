import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try (Connection conexao = ConexaoBanco.getConexao()) {
            if(conexao != null) {
                System.out.println("Conectado com o banco de dados!");
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao conectar com banco de dados" + erro.getMessage());
        }


        Carro carro1 = new Carro("Sedan LX", 80000, 4);

        Carro carro2 = new Carro("SUV Premium", 120000, 5);

        Moto moto1 = new Moto("Yamaha MT-07", 40000, 689);

        Moto moto2 = new Moto("Honda CG 160", 18000, 162);

        VeiculoStorage crud = new VeiculoStorage();

        System.out.println("\n\n");

        crud.criarTabela();

        System.out.println("\n\n");

        crud.salvarVeiculo(carro1);
        crud.salvarVeiculo(carro2);
        crud.salvarVeiculo(moto1);
        crud.salvarVeiculo(moto2);

        System.out.println("\n\n");

        List<Veiculo> veiculosOriginais = crud.buscarTodosVeiculos();
        for(Veiculo veiculo : veiculosOriginais) {
            System.out.printf("Tipo: %s - Modelo: %s - Preço Base: %.2f - Preço Final: %.2f - Imposto: %.2f\n",
                    veiculo.getTipo(), veiculo.getModelo(), veiculo.getPrecoBase(),
                    veiculo.calcularPrecoFinal(), veiculo.calcularImposto());
        }

        System.out.println("\n\n");

        crud.atualizarPrecoBase(2, 130000);

        System.out.println("\n\n");

        crud.deletarVeiculo(4);

        System.out.println("\n\n");

        List<Veiculo> veiculosAtualizados = crud.buscarTodosVeiculos();
        for(Veiculo veiculo : veiculosAtualizados) {
            System.out.printf("Tipo: %s - Modelo: %s - Preço Base: %.2f - Preço Final: %.2f - Imposto: %.2f\n",
                    veiculo.getTipo(), veiculo.getModelo(), veiculo.getPrecoBase(),
                    veiculo.calcularPrecoFinal(), veiculo.calcularImposto());
        }

    }

}
