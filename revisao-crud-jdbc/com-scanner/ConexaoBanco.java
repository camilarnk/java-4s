import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    public static Connection getConexao() {

        String url = "jdbc:h2:./listaRevisao";
        String user = "sa";
        String password = "";

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException erro) {
            return null;
        }
    }
}
