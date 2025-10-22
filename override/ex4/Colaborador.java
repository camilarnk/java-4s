package ex4;

/* 4. Sistema de RH: Política de Férias
Uma empresa de tecnologia tem uma política de férias base, mas cargos diferentes têm benefícios adicionais.

• Sua Tarefa: Crie uma superclasse Colaborador com um método calcularFerias() que retorna o valor 30
(dias). Crie uma subclasse Gerente que herda de Colaborador. Sobrescreva o método calcularFerias()
na classe Gerente para que ele retorne 30 + 7, representando 30 dias padrão mais 7 dias de bônus.
*/

public class Colaborador {
    private double salario;
    private String nome;

    public Colaborador(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    public int calcularFerias() {
        return 30;
    }
}
