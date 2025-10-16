package contadorLivros;

/* 1. Contador de Livros: Implemente o contador estático na classe Livro conforme visto em aula. Crie o
atributo private static int contadorDeLivros, incremente-o no construtor e crie o método public static
int getContadorDeLivros() para acessá-lo.  */

public class Main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        System.out.printf("Quantidade de livros: %d", Livro.getContadorDeLivros());

    }
}