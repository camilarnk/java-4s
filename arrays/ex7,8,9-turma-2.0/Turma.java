import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {

        System.out.println("-------------- Lista de Alunos -----------------");
        for (Aluno aluno : alunos) {
            System.out.printf("Nome: %s - RA: %d\n", aluno.getNome(), aluno.getRa());
        }
        System.out.println("------------------------------------------------");
        
    }

    public Aluno buscarAlunoPorRa(int ra) {

        for (Aluno aluno : alunos) {
            if(aluno.getRa() == ra && aluno != null) {
                return aluno;
            }
        }
        return null;

    }

    public int getNumeroDeAlunos() {
        return alunos.size();
    }

    public Aluno getAlunoNaPosicao(int indice) {
        return alunos.get(indice);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

}