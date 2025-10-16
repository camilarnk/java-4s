package contadorLivros;

public class Livro {
    private static int contadorDeLivros;

    public Livro() {
        contadorDeLivros++;
    }

    public static int getContadorDeLivros() {
        return contadorDeLivros;
    }

}