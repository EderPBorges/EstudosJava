package Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        Scanner entrada = new Scanner(System.in);
        int codigo;
        System.out.println("Informe o codigo da pessoa a ser deletada: ");
        codigo = entrada.nextInt();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);
        // stmt.execute();

        int contador = stmt.executeUpdate();

        if (contador > 0) {
            System.out.println("Pessoa excluida com sucesso! ");
        } else {
            System.out.println("Não ha ninguem com esse codigo. ");
        }
        System.out.println("Linhas afetadas: " + contador);

        entrada.close();
        stmt.close();
        conexao.close();
    }
}
