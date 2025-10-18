/*

8. Caça ao Bug: O Construtor Esquecido 
O código abaixo não compila. Analise as classes Pai e Filha. Identifique o erro de compilação na
classe Filha e explique em um comentário por que ele ocorre. Em seguida, corrija o código para que
ele compile e funcione. 

// CÓDIGO COM ERRO
class Pai {
    String nome;
    public Pai(String nome) {
        this.nome = nome;
    }
}
class Filha extends Pai {
    int idade;
    // O erro de compilação está aqui! Por quê?
    public Filha(int idade) {
        this.idade = idade;
    }
}

Resposta: O código não compila pois o construtor da classe Filha não inicializa o atributo 'nome' da
classe pai, e por ser uma classe que extends Pai, é obrigatório utilizar também os atributos herdados.
Código corrigido:
class Filha extends Pai {
    int idade;
    public Filha(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }
}

 */