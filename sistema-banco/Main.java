public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Maria", "32131313131");
        Cliente cliente2 = new Cliente("Ana", "64564646464");

        ContaBancaria conta1 = new ContaBancaria("32131-1", 0, cliente1);
        ContaBancaria conta2 = new ContaBancaria("35453-1", 3000.00, cliente2);

        Banco banco1 = new Banco("FinanBank");

        banco1.adicionarConta(conta1);
        banco1.adicionarConta(conta2);

        banco1.listarContas();

        conta1.sacar(10);
        conta1.depositar(500);
        
        banco1.listarContas();

        conta1.transferir(conta2, 249.99);

        banco1.listarContas();

        conta2.sacar(300);

        banco1.listarContas();

    }
}