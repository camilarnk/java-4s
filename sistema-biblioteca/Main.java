public class Main {
    public static void main(String[] args) {
        
        Leitor leitor1 = new Leitor("Maria", "4298424892");
        Leitor leitor2 = new Leitor("Daniele", "429834284");

        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Universitária", "Avenida Brasil");

        biblioteca1.adicionarLivro("Clean Code", "Robert Martin", "9780135398579");
        biblioteca1.adicionarLivro("Sistemas Operacionais Modernos", "Andrew Tanenbaum",
        "9780130313584");

        biblioteca1.emprestarLivro("9780135398579", leitor1);
        biblioteca1.emprestarLivro("9780135398579", leitor2);
        biblioteca1.listarAcervo();

        biblioteca1.emprestarLivro("9780130313584", leitor2);
        biblioteca1.listarAcervo();

        biblioteca1.devolverLivro("9780130313584");
        biblioteca1.listarAcervo();

    }
}