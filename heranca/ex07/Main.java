package ex07;

public class Main {
    public static void main(String[] args) {
        
        Circulo circ = new Circulo("Verde", 5);
        Retangulo ret = new Retangulo("Azul", 10, 20);

        System.out.println(circ.toString());
        System.out.println(ret.toString());

    }
}
