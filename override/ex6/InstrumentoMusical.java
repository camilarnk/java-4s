package ex6;

/* 6. Orquestra Virtual
Você está criando um software que simula uma orquestra.
Cada instrumento pode ser "tocado", mas produz um som diferente.

• Sua Tarefa: Crie uma superclasse InstrumentoMusical com um método tocar() que imprime "Tocando
um instrumento...". Crie subclasses como Violao (que imprime "Soando cordas de nylon..."), Bateria
(que imprime "Rufo de tambores...") e Piano (que imprime "Melodia ao piano..."), todas
sobrescrevendo o método tocar(). */

public class InstrumentoMusical {
    
    public InstrumentoMusical() {
    }

    public String tocar() {
        return "Tocando um instrumento...";
    }

}
