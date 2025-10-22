package ex5;

public class Guerreiro extends Personagem {

    public Guerreiro() {
        super();
    }
    
    @Override
    public String atacar() {
        return "Guerreiro ataca com a espada!";
    }
}
