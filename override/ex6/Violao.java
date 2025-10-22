package ex6;

public class Violao extends InstrumentoMusical {

    public Violao() {
        super();
    }

    @Override
    public String tocar() {
        return "Soando cordas de nylon...";
    }
}
