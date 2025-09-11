public class Playlist {
    private Musica[] musicas;
    private int proximaPosicao;

    public Playlist() {
        this.musicas = new Musica[20];
        this.proximaPosicao = 0;
    }

    public void adicionarMusica(Musica musica) {
        if(proximaPosicao < musicas.length) {
            this.musicas[proximaPosicao] = musica;
            proximaPosicao++;
            System.out.println("Música adicionada a playlist!");
        }else{
            System.out.println("Limite da playlist atingido!");
        }
    }

    public void exibirMusicas() {
        for(int i=0; i<proximaPosicao; i++) {
            if(musicas[i] != null) {
                System.out.printf("Música %d: %s - %.2f de duração\n", i+1, musicas[i].getNome(), musicas[i].getDuracao());
            }
        }
    }

}
