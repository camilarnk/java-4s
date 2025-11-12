import java.util.List;
import java.util.Scanner;

public class ItemCRUD {

    private Scanner leitor = new Scanner(System.in);

    public ItemVendavel criarItem() {
        System.out.println("\n---- Adicionar Item ----");
        System.out.println("Tipo de item:");
        System.out.println("1 - Produto Físico");
        System.out.println("2 - Serviço Digital");
        System.out.print("Escolha: ");
        int tipo = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Nome do item: ");
        String nome = leitor.nextLine();

        System.out.print("Preço base: ");
        double precoBase = leitor.nextDouble();

        ItemVendavel novoItem;

        if (tipo == 1) {
            System.out.print("Peso (kg): ");
            double peso = leitor.nextDouble();
            novoItem = new ProdutoFisico(nome, precoBase, peso);
        } else if (tipo == 2) {
            System.out.print("Duração em meses: ");
            int duracao = leitor.nextInt();
            novoItem = new ServicoDigital(nome, precoBase, duracao);
        } else {
            System.out.println("Tipo invalido. Item nao criado.");
            return null;
        }

        return novoItem;
    }

    public void listarItens(List<String> itensSalvos) {
        System.out.println("\n---- Itens Cadastrados ----");

        if (itensSalvos.isEmpty()) {
            System.out.println("Nenhum item encontrado no banco de dados.");
            return;
        }

        for (String item : itensSalvos) {
            System.out.println(item);
        }
    }

    public int solicitarIdAtualizacao() {
        System.out.print("\nDigite o ID do item que deseja atualizar: ");
        return leitor.nextInt();
    }

    public double solicitarNovoPreco() {
        System.out.print("Digite o novo preço base: ");
        return leitor.nextDouble();
    }

    public int solicitarIdDelecao() {
        System.out.print("\nDigite o ID do item que deseja deletar: ");
        return leitor.nextInt();
    }
}