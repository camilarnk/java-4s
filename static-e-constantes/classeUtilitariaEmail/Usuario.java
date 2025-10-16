package classeUtilitariaEmail;

public class Usuario {
    private String email;

    public Usuario(String email) {
        this.email = email;
    }

    public void setEmail(String email) {
        if(ValidacaoUtil.isEmailValido(email)) {
            this.email = email;
            System.out.println("Email alterado.");
        }else{
            System.out.println("Email inválido.");
        }
    }

}