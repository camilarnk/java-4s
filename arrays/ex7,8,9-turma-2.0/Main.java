public class Main {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("aluno1", 231313231);
        Aluno aluno2 = new Aluno("aluno2", 231233231);

        Turma poo = new Turma();

        poo.matricularAluno(aluno1);
        poo.matricularAluno(aluno2);
        poo.listarAlunos();

        Aluno raBusca = poo.buscarAlunoPorRa(231313231);

        if(raBusca != null) {
            System.out.printf("Aluno %s encontrado pelo RA %d\n", raBusca.getNome(), raBusca.getRa());
        } else {
            System.out.println("Nenhum aluno encontrado com o RA informado");
        }

        System.out.printf("Número de alunos na turma: %d\n", poo.getNumeroDeAlunos());

        int indexBusca = 1;
        Aluno alunoBusca = poo.getAlunoNaPosicao(indexBusca);

        if(alunoBusca != null) {
            System.out.printf("Aluno no index %d: %s\n", indexBusca, alunoBusca.getNome());
        } else {
             System.out.printf("Nenhum aluno encontrado com o index %d\n", indexBusca);
        }

        poo.removerAluno(aluno1);
        poo.listarAlunos();

    }
}