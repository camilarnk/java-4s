package ex2;

/* 2. Simulador de Sons de Animais
Você está desenvolvendo um software educativo para crianças que simula os sons de diferentes animais.

• Sua Tarefa: Crie uma superclasse Animal com um método emitirSom() que imprime "O animal emite
um som". Em seguida, crie duas subclasses:
o Cachorro: Sobrescreva o método emitirSom() para que ele imprima "Au au!".
o Gato: Sobrescreva o método emitirSom() para que ele imprima "Miau!".
o Teste: No main, crie um Cachorro e um Gato e chame o método emitirSom() em ambos para
observar os comportamentos diferentes.
*/

public class Main {
    public static void main(String[] args) {
        
        Cachorro dog = new Cachorro("Dog");
        Gato cat = new Gato("Cat");

        System.out.printf("%s - %s\n", dog.getNome(), dog.emitirSom());
        System.out.printf("%s - %s\n", cat.getNome(), cat.emitirSom());

    }
}
