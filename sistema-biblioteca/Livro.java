public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean status;
    private Leitor leitor;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.status = false;
    }

    public void emprestar(Leitor leitor) {
        setStatus(true);
        setLeitor(leitor);
    }

    public void devolver() {
        setStatus(false);
        setLeitor(null);
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public boolean isEmprestado() {
        return this.status;
    }

    public Leitor getLeitor() {
        return this.leitor;
    }

    public String getTitulo() {
        return this.titulo;
    }
    
    public String getAutor() {
        return this.autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

}
