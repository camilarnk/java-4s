package classeUtilitariaEmail;

public class ValidacaoUtil {
    
    private ValidacaoUtil() {
    }

    public static boolean isEmailValido(String email) {
        if(email == null) { // necessario pois usar .contains() em email null daria um NullPointerException
            return false;
        }
        return email.contains("@") && email.contains(".");
    }

}