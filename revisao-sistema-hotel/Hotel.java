import java.util.ArrayList;

public class Hotel {
    private String nome;
    private String endereco;
    private ArrayList<Quarto> quartos;
    
    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    public void adicionarQuarto(int numeroQuarto, String tipoQuarto, double precoPorNoiteQuarto) {
        this.quartos.add(new Quarto(numeroQuarto, tipoQuarto, precoPorNoiteQuarto));
    }

    public void hospedar(Hospede hospede, int numeroQuarto) {
        
        for (Quarto quarto : quartos) {

            if(quarto.getNumero() == numeroQuarto) {

                if(!quarto.isOcupado()) {
                    quarto.ocupar(hospede);
                    System.out.printf("\n%s foi hospedado(a) no quarto %d %s!\n",
                        quarto.getHospedeAtual().getNome(), quarto.getNumero(), quarto.getTipo()
                    );
                }else{
                    System.out.printf("\nO quarto %d %s está atualmente ocupado\n", 
                        quarto.getNumero(), quarto.getTipo()
                    );
                }
            }
        }
    }

    public void realizarCheckout(int numeroQuarto) {

        for (Quarto quarto : quartos) {

            if(quarto.getNumero() == numeroQuarto) {

                if(quarto.isOcupado()) {
                    quarto.liberar();
                    System.out.printf("\nO quarto %d %s foi liberado!\n", 
                        quarto.getNumero(), quarto.getTipo()
                    );
                }else{
                    System.out.printf("\nO quarto %d %s já está desocupado\n", 
                        quarto.getNumero(), quarto.getTipo()
                    );
                }
            }
        }
    }

    public void exibirRelatorioOcupado() {
        System.out.println("-----------------------------------------------------");
        System.out.printf("Relátorio dos quartos do %s - %s\n", getNome(), getEndereco());

        for (Quarto quarto : quartos) {

            if(quarto.isOcupado()) {
                System.out.printf(
                    "\nQuarto %s, Número %d, Preço por noite: R$%.2f\nHospedado por: %s, CPF %s\n",
                    quarto.getTipo(), quarto.getNumero(), quarto.getPrecoPorNoite(),
                    quarto.getHospedeAtual().getNome(), quarto.getHospedeAtual().getCpf()
                );
            }else{
                System.out.printf(
                    "\nQuarto %s, Número %d, Preço por noite: R$%.2f\nNão está hospedado no momento\n",
                    quarto.getTipo(), quarto.getNumero(), quarto.getPrecoPorNoite()
                );
            }
        }

        System.out.println("-----------------------------------------------------");
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

}