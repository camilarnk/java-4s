package classeUtilitariaEmail;

/* 7. e 8. Caixa de Ferramentas de Validação: Crie uma classe utilitária ValidacaoUtil com um construtor
privado. Adicione a ela um método estático public static boolean isEmailValido(String email). A
validação pode ser simples: verifique se o email contém o caractere @ e ..
Crie uma classe Usuario com um setter setEmail(String email). Dentro deste setter, antes de atribuir
o valor, use a sua ferramenta ValidacaoUtil.isEmailValido(email) para verificar se o email é válido. */

public class Main {
    public static void main(String[] args) {
        
        Usuario user = new Usuario("emailteste1@xyz.com");
        user.setEmail("emailteste2@xyz");

    }
}