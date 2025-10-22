package ex5;

public class Mago extends Personagem {

    public Mago() {
        super();
    }
    
    @Override
    public String atacar() {
        return "Mago lança uma bola de fogo!";
    }
}
