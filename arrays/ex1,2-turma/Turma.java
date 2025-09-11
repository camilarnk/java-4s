public class Turma {
    private Aluno[] alunos;
    private int proximaPosicaoLivre;

    public Turma(int capacidadeMax) {
        this.alunos = new Aluno[capacidadeMax];
        this.proximaPosicaoLivre = 0;
    }

    public void matricularAluno(Aluno aluno) {

        if(proximaPosicaoLivre < alunos.length){
            alunos[proximaPosicaoLivre] = aluno;
            proximaPosicaoLivre++;
            System.out.println("Aluno matriculado!");
        }else{
            System.out.println("A capacidade máxima da turma foi atingida!");
        }

    }

    public void listarAlunos() {

        for(int i=0; i<proximaPosicaoLivre; i++){ // i<=tamanho geraria index out of bound
            if(alunos[i] != null) {
                System.out.printf("Nome: %s\nRA: %d\n", alunos[i].getNome(), alunos[i].getRa());
            }
        }
        
    }

    public Aluno buscarAlunoPorRa(int ra) {

        for(int i=0; i<proximaPosicaoLivre; i++){
            if(alunos[i] != null && ra == alunos[i].getRa()) {
                return alunos[i];
            }
        }
        return null;

    }

}
