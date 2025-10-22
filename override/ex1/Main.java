package ex1;

/* 1. Sistema de Pedágio "Via Rápida"
A concessionária "Via Rápida" precisa de um sistema para calcular as tarifas de pedágio, que variam
conforme o tipo de veículo.

• Sua Tarefa: Implemente a hierarquia de classes Veiculo, Carro e Moto, conforme o desafio da aula.
o Veiculo (Superclasse): Deve ter atributos como marca e modelo. Crie um método public
double calcularPedagio() que retorna uma tarifa base de R$ 10,50.
o Carro (Subclasse): Deve herdar de Veiculo. Sobrescreva (@Override) o método
calcularPedagio() para que ele retorne a tarifa específica de R$ 12,00.
o Moto (Subclasse): Deve herdar de Veiculo. Sobrescreva (@Override) o método
calcularPedagio() para que ele retorne a tarifa de R$ 6,00.
o Teste: No main, crie um objeto de cada tipo e chame o mesmo método calcularPedagio() em
cada um para verificar se os valores corretos são retornados.
*/

public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Cadillac", "Escalade");
        Moto moto = new Moto("Kawasaki", "Ninja");

        System.out.printf("%s %s - Pedágio: R$%.2f\n",
            carro.getMarca(), carro.getModelo(), carro.calcularPedagio());
        System.out.printf("%s %s - Pedágio: R$%.2f\n",
            moto.getMarca(), moto.getModelo(), moto.calcularPedagio());
    }
}