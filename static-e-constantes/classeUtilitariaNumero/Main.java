package classeUtilitariaNumero;

/* 9. Caixa de Ferramentas de Arrays: Crie uma classe ArrayUtil com um construtor privado. Adicione um
método estático public static int encontrarMaiorNumero(int[] numeros) que recebe um array de
inteiros e retorna o maior valor contido nele. */

public class Main {
    public static void main(String[] args) {
        
        int[] arrayNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int maiorNumero = ArrayUtil.encontrarMaiorNumero(arrayNumeros);
        System.out.printf("Maior número do array: %d", maiorNumero);

    }
}
