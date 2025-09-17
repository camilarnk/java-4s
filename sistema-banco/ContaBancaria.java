public class ContaBancaria {
    private String numero;
    private double saldo;
    private Cliente cliente;

    public ContaBancaria(String numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void depositar(double valor) {

        if(valor > 0) {
            this.saldo += valor;
            System.out.printf("\nR$%.2f adicionados à conta %s.\n", valor, this.numero);
        } else {
            System.out.printf("\nNão foi possível depositar o valor à conta %s.\n", this.numero);
        }
    }

    public void sacar(double valor) {

        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.printf("\nR$%.2f sacados da conta %s.\n", valor, this.numero);
        } else {
            System.out.printf("\nNão foi possível sacar o valor da conta %s.\n", this.numero);
        }
    }

    public void transferir(ContaBancaria destino, double valor) {

        if(this.saldo >= valor && destino != null && destino.getNumero() != this.numero) {
            destino.setSaldoDestino(valor);
            this.saldo -= valor;
            System.out.printf("\nR$%.2f transferidos de %s para %s\n",
            valor, this.cliente.getNome(), destino.getCliente().getNome());
        } else {
            System.out.printf("\nNão foi possível transferir o valor da conta %s\n", this.numero);
        }
    }

    public String getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setSaldoDestino(double valor) {
        this.saldo += valor;
    }
    
}
