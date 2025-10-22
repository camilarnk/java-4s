package ex3;

/* 3. Software de Design Gráfico "CanvasPro"
O "CanvasPro" precisa calcular a área de diferentes formas geométricas. A fórmula varia para cada forma,
mas a ação de "calcular a área" é comum a todas.

• Sua Tarefa: Crie uma superclasse FormaGeometrica. Dentro dela, crie um método calcularArea() que
retorna 0.0. Crie duas subclasses:
o Circulo: Adicione o atributo raio e sobrescreva calcularArea() para retornar a fórmula correta
(Math.PI * raio * raio).
o Quadrado: Adicione o atributo lado e sobrescreva calcularArea() para retornar a fórmula
correta (lado * lado).
o Teste: No main, crie um círculo e um quadrado com medidas diferentes e imprima o resultado
de calcularArea() para cada um.
*/

public class Main {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(4);
        Quadrado quadrado = new Quadrado(5);

        System.out.printf("Área Circulo: %.2f\n", circulo.calcularArea());
        System.out.printf("Área Quadrado: %.2f\n", quadrado.calcularArea());

    }    
}
