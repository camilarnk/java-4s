public class Main {
    public static void main(String[] args) {
        
        /*
        5. O Erro Oculto (Conceitual): No método listarAlunos da sua classe Turma, por que o loop for deve ir
        até proximaPosicaoLivre e não até alunos.length? O que aconteceria se você usasse alunos.length
        para percorrer e tentasse imprimir alunos[i].getNome()?
    
        O loop deve ir até proximaPosicaoLivre pois ele indica quantos alunos foram realmente cadastrados na turma, 
        percorrendo apenas posições preenchidas.
        Usando alunos.length, seria percorrido todas as posições do array, inclusive as que ainda não tem valor e
        estão null, e ao tentar imprimir os valores, teria um NullPointerException.
        Como os índices do array vão de 0 até length - 1, tentar acessar alunos[length] geraria um IndexOutOfBoundsException.

    */

    }
}