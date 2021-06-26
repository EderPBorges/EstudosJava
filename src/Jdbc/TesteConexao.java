package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
     //   Connection conexao = DriverManager.getConnection(url, usuario, senha);
        class ConexaoBd {
            public void main(String[] args) throws SQLException, ClassNotFoundException {
                final String url = "jdbc:mysql://localhost:3306/usuario";
                final String usuario = "root";
                final String senha = "12345678";

                Class.forName("com.mysql.jdbc.Driver"); /* Aqui registra */
                Connection conexao = DriverManager.getConnection(url,usuario,senha);

                conexao.close();
            }
        }

        System.out.println("Conexão efetuada com sucesso ");

    }
}
