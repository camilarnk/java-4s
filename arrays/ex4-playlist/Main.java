public class Main {
    public static void main(String[] args) {
        
        Musica musica1 = new Musica(3.28, "nomedamusica1");
        Musica musica2 = new Musica(3.12, "nomedamusica2");

        Playlist minhaPlaylist = new Playlist();

        minhaPlaylist.adicionarMusica(musica1);
        minhaPlaylist.adicionarMusica(musica2);
        minhaPlaylist.exibirMusicas();

    }
}