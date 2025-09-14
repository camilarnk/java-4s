import java.util.ArrayList;

public class Time {
    private ArrayList<Jogador> jogadores;
    private String nome;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public void contratarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void exibirEscalacao() {
        System.out.printf("------------- Escalação do Time %s -------------\n", getNome());

        for (Jogador jogador : jogadores) {
            System.out.printf("%s - %s\n", jogador.getNome(), jogador.getPosicao());
        }

        System.out.println("------------------------------------------------");
    }

    public String getNome() {
        return this.nome;
    }
    
}
