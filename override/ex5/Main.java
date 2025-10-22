package ex5;

/* 5. Jogo de RPG "Crônicas de Valéria"
No jogo "Crônicas de Valéria", todos os personagens podem atacar, mas cada classe de personagem tem uma
forma de ataque diferente.

• Sua Tarefa: Crie uma superclasse Personagem com um método atacar() que imprime "Personagem
realiza um ataque básico!". Crie duas subclasses:
o Guerreiro: Sobrescreva o método atacar() para imprimir "Guerreiro ataca com a espada!".
o Mago: Sobrescreva o método atacar() para imprimir "Mago lança uma bola de fogo!".
o Teste: Crie um Guerreiro e um Mago e chame o método atacar() em cada um. */

public class Main {
    public static void main(String[] args) {
        
        Guerreiro g = new Guerreiro();
        Mago m = new Mago();

        System.out.println(g.atacar());
        System.out.println(m.atacar());

    }
}
