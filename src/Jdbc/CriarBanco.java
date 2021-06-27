package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//public class CriarBanco {
//    public static void main(String[] args) throws SQLException{
//        class ConexaoBd {
//            public void main(String[] args) throws SQLException, ClassNotFoundException {
//                final String url = "jdbc:mysql://localhost:3306/usuario";
//                final String usuario = "root";
//                final String senha = "12345678";
//
//                Class.forName("com.mysql.jdbc.Driver"); /* Aqui registra */
//                Connection conexao = DriverManager.getConnection(url, usuario, senha);
//
//                Statement stmt = conexao.createStatement();
//
//                System.out.println("vendo se chega até aqui");
//
//                stmt.execute("CREATE DATABASE curso_java");
//
//                System.out.println("Banco criado com sucesso!");
//                conexao.close();
//            }
//        }
//    }
//}
public class CriarBanco {
    static final String DB_URL = "jdbc:mysql://localhost:3306/usuario";
    static final String USER = "guest";
    static final String PASS = "guest123";

    public static void main(String[] args) throws SQLException{
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE DATABASE STUDENTS";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}