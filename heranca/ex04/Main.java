package ex04;

public class Main {
    public static void main(String[] args) {

        Eletronico eletro = new Eletronico(123, "Geladeira", 1800.00, 220, 24);
        Movel movel = new Movel(322, "Mesa", 450.00, "Madeira", "Marrom");

        System.out.println(eletro.toString());
        System.out.println(movel.toString());

    }
}