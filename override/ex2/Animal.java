package ex2;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String emitirSom() {
        return "O animal emite um som";
    }

    public String getNome() {
        return nome;
    }
    
}
