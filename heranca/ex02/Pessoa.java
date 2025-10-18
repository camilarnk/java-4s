package ex02;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString() {
        return String.format("Nome: %s - CPF: %s ", nome, cpf);
    }

}