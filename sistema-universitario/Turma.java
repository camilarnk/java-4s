import java.util.ArrayList;

public class Turma {
    private String nome;
    private int capacidade;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void matricularAluno(Aluno aluno) {

        if(this.alunos.size() < getCapacidade()) {
            this.alunos.add(aluno);
            System.out.printf("\n%s - RA: %s - Matriculado em %s com Sucesso!\n",
            aluno.getNome(), aluno.getRa(), getNome());
        } else {
            System.out.printf("\nA capacidade máxima da turma %s já foi atingida! (%d/%d)\n",
            getNome(), getQuantidadeAlunos(), getCapacidade());
        }

    }

    public void listarAlunos() {

        int i = 1;
        for(Aluno aluno : alunos) {
            System.out.printf("%d. %s - RA: %s\n", i, aluno.getNome(), aluno.getRa());
            i++;
        }

    }

    public int getQuantidadeAlunos() {
        return this.alunos.size();
    }

    public String getNome() {
        return this.nome;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

}
