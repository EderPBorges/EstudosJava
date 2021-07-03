package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        final String url = "jdbc:mysql://localhost:3306/estudos";
        final String usuario = "root";
        final String senha = "root";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        // Connection conexao = FabricaConexao.getConexao(); testando FabricaConexao
        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso! ");
        conexao.close();
    }

}


