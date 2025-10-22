package ex4;

public class Gerente extends Colaborador {
    
    public Gerente(double salario, String nome) {
        super(salario, nome);
    }

    @Override
    public int calcularFerias() {
        return 30 + 7;
    }
}
