package ex02;

public class Aluno extends Pessoa {
    private String ra;
    private String curso;

    public Aluno(String nome, String cpf, String ra, String curso) {
        super(nome, cpf);
        this.ra = ra;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("- RA: %s - Curso: %s", ra, curso);
    }

}