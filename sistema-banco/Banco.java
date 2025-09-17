import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(ContaBancaria conta) {

        this.contas.add(conta);
        System.out.printf("\nNova conta de %s criada!\n", conta.getCliente().getNome());
    }

    public void listarContas() {

        System.out.printf("\nContas do Banco %s\n", this.nome);
        for (ContaBancaria conta : contas) {
            System.out.printf("Cliente %s - Número %s - Saldo R$%.2f\n",
            conta.getCliente().getNome(), conta.getNumero(), conta.getSaldo());
        }
        System.out.println();
    }

    public ContaBancaria buscarContaPorNumero(String numero) {

        for (ContaBancaria conta : contas) {
            if(conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }
    
}
