/* 
 
6. Prevendo a Ordem da Construção (Leitura de Código)
Considere o código da hierarquia abaixo. Sem compilar, preveja a ordem exata das mensagens que serão
impressas no console quando a linha new SubSubClasse(); for executada no main. Justifique sua resposta em
um comentário.

class SuperClasse {
    public SuperClasse() {
        System.out.println("1. Construtor da SuperClasse");
    }
}
class SubClasse extends SuperClasse {
    public SubClasse() {
        super(); // Chamada explícita (mas seria implícita de qualquer forma)
        System.out.println("2. Construtor da SubClasse");
    }
}
class SubSubClasse extends SubClasse {
    public SubSubClasse() {
        super();
        System.out.println("3. Construtor da SubSubClasse");
    }
}

Resposta: Será impresso no console a mensagem da super classe, seguida da SubClasse,
e por último a SubSubClasse, pois a ordem de execução de heranças é feita da super classe
seguindo até a hierarquia mais baixa.

*/