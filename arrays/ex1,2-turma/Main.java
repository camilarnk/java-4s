public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Aluno 1", 43284282);
        Aluno aluno2 = new Aluno("Aluno 2", 75756772);

        Turma POO = new Turma(10);

        POO.matricularAluno(aluno1);
        POO.matricularAluno(aluno2);
        POO.listarAlunos();

        if(POO.buscarAlunoPorRa(43284282) != null){
            System.out.printf("Aluno encontrado! %s", POO.buscarAlunoPorRa(43284282).getNome());
        }else{
            System.out.println("Aluno não encontrado");
        }

    }
}