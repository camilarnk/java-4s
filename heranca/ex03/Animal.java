package ex03;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return String.format("Nome do pet: %s - Idade: %d ", nome, idade);
    }

}