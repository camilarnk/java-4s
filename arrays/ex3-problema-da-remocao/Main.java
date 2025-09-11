public class Main {
    public static void main(String[] args) {
        
        /*
        3. O Problema da Remoção (Conceitual): Em um comentário no seu código, descreva com suas
        palavras os passos que você precisaria seguir para implementar um método removerAluno(int ra).
        Quais são as principais dificuldades e riscos dessa implementação usando um array? 


        Para implementar o método removerAluno(int ra) seria necessário percorrer o array de alunos até o final,
        verificando se o ra atual do loop é igual ao ra a remover, fornecido no parametro.
        Ao encontrar o ra, a posição dele passaria ser null, removendo o aluno, e a busca seria encerrada.
        A variável proximaPosicaoLivre deveria ser decrementada, liberando uma posição no array.

        Dificuldades e riscos usando array fixo:
        Remover um ra de qualquer posição que não fosse o final deixaria um espaço null no meio do array. Uma opção
        seria deslocar todos os elementos que estão após esse null, mas seria trabalhoso.
        Se não atualizar a variável proximaPosicaoLivre, alunos já inseridos no array poderiam ser substituidos ao
        ao adicionar novos.
        Sem métodos prontos para trabalhar com array fixo, tudo precisa ser feito manualmente. 

        */
    }
}