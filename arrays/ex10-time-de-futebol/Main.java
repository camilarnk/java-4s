public class Main {
    public static void main(String[] args) {
        
        Jogador jogador1 = new Jogador("Kelce", "Tight End");
        Jogador jogador2 = new Jogador("Mahomes", "Quarterback");

        Time time1 = new Time("Chiefs");

        time1.contratarJogador(jogador1);
        time1.contratarJogador(jogador2);
        time1.exibirEscalacao();

    }
}