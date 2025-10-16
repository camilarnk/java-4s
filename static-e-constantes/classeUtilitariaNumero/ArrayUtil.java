package classeUtilitariaNumero;

public class ArrayUtil {

    private ArrayUtil() {
    }

    public static int encontrarMaiorNumero(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array não pode ser null ou vazio");
        }

        int maior = numeros[0];
        for (int numero : numeros) {
            if(numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
    
}
