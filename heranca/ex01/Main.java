package ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Bugatti", "Chiron", 2024, 2);
        Moto moto = new Moto("Honda", "Biz", 2025, 125);

        System.out.println(carro.toString());
        System.out.println(moto.toString());

        List<Veiculo> minhaFrota = new ArrayList<>();

        minhaFrota.add(carro);
        minhaFrota.add(moto);

        for (Veiculo veiculo : minhaFrota) {
            System.out.println(veiculo);
        }

    }
}