package constantes;

public class ConfiguracaoSistema {
    public static final int NUMERO_MAXIMO_LOGIN_TENTATIVAS = 5;
    public static final String URL_BLOG_DA_EMPRESA = "htttps://meublog.com.br";

    public ConfiguracaoSistema() {
    }

    public static void imprimir() {
        System.out.printf("Número máximo de tentativas de login: %d\nURL do blog da empresa: %s\n",
        NUMERO_MAXIMO_LOGIN_TENTATIVAS, URL_BLOG_DA_EMPRESA);
    }

}