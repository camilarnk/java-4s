import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Livro> livros;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, String isbn) {
        this.livros.add(new Livro(titulo, autor, isbn));
        System.out.printf("%s adicionado a %s!\n", titulo, getNome());
    }

    public void emprestarLivro(String isbnEmprestar, Leitor leitorEmprestar) {

        for(Livro livro : livros) {

            if(livro.getIsbn().equals(isbnEmprestar)) {

                if(livro.isEmprestado()) {
                    System.out.printf("O livro %s de %s está atualmente emprestado\n",
                    livro.getTitulo(), livro.getAutor());
                }else{
                    livro.emprestar(leitorEmprestar);
                    System.out.printf("%s emprestado para %s!\n", livro.getTitulo(),
                    leitorEmprestar.getNome());
                }
                return;
            }
        }
        System.out.printf("Nenhum livro com ISBN %s está cadastrado na biblioteca\n", isbnEmprestar);
    }

    public void devolverLivro(String isbnDevolver) {

        for(Livro livro : livros) {

            if(livro.getIsbn().equals(isbnDevolver)) {

                if(livro.isEmprestado()) {
                    livro.devolver();
                    System.out.printf("%s devolvido!\n", livro.getTitulo());
                }else{
                    System.out.printf("O livro %s já está na biblioteca\n", livro.getTitulo());
                }
                return;
            }
        }
        System.out.printf("Nenhum livro com ISBN %s está cadastrado na biblioteca\n", isbnDevolver);
    }

    public void listarAcervo() {

        System.out.printf("-------- %s - %s --------\n",getNome(), getEndereco());
        
        for(Livro livro : livros) {

            System.out.printf("%s - Autor: %s - ISBN: %s\n",
            livro.getTitulo(), livro.getAutor(), livro.getIsbn());

            if(livro.isEmprestado()) {
                System.out.printf("Status: Emprestado por %s, com CPF %s\n",
                livro.getLeitor().getNome(), livro.getLeitor().getCpf());
            }else{
                System.out.printf("Status: Livre\n");
            }
        }

        System.out.println("-----------------------------------------------------------\n");
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

}
