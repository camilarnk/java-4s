import java.util.ArrayList;

public class Universidade {
    private String nome;
    private String endereco;
    private ArrayList<Turma> turmas = new ArrayList<>();
    
    public Universidade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
        System.out.printf("\nTurma %s Matriculada com Sucesso!\n", turma.getNome());
    }

    public void listarTurmas() {

        System.out.printf("\nTurmas da Universidade %s - %s\n", getNome(), getEndereco());
        int i = 1;
        for (Turma turma : turmas) {
            System.out.printf("%d. %s\n", i, turma.getNome());
            i++;
        }

    }

    public void exibirRelatorioCompleto() {

        System.out.printf("\nRelatório completo da Universidade %s - %s\n", getNome(), getEndereco());
        int i = 1;

        for (Turma turma : turmas) {
            System.out.printf("\nTurma %d. %s\nAlunos (%d/%d)\n",
            i, turma.getNome(), turma.getQuantidadeAlunos(), turma.getCapacidade());
            turma.listarAlunos();
            i++;
        }

    }
    
    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

}
