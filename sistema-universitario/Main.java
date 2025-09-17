public class Main {
    public static void main(String[] args) {

        Turma turma1 = new Turma("Admin", 30);
        Turma turma2 = new Turma("Fisio", 25);
        
        Aluno aluno1 = new Aluno("Beatriz", "323131133-2");
        Aluno aluno2 = new Aluno("Maria", "3123142342-2");
        Aluno aluno3 = new Aluno("Andressa", "464564643-2");
        Aluno aluno4 = new Aluno("Rebecca", "545353535-2");
        Aluno aluno5 = new Aluno("Bruna", "423424242342-2");
        Aluno aluno6 = new Aluno("Talita", "4242424324-2");

        turma1.matricularAluno(aluno1);
        turma1.matricularAluno(aluno2);
        turma1.matricularAluno(aluno3);

        turma2.matricularAluno(aluno4);
        turma2.matricularAluno(aluno5);
        turma2.matricularAluno(aluno6);

        Universidade uni1 = new Universidade("EducaAi", "Avenida Brasil");

        uni1.adicionarTurma(turma1);
        uni1.adicionarTurma(turma2);

        uni1.listarTurmas();
        uni1.exibirRelatorioCompleto();

    }
}