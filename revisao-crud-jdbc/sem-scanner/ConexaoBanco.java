import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    public static Connection getConexao() {

        try {
            String url = "jdbc:h2:./listaRevisao";
            String user = "sa";
            String password = "";
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException erro) {
            throw new RuntimeException("Erro ao tentar conectar com o banco" + erro.getMessage());
        }

    }
}
