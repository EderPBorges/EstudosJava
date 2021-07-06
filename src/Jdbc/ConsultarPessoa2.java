package Jdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {
    public static void main(String[] args) throws SQLException {
        System.out.print("Informe o nome a ser procurado: ");
        Scanner leitor = new Scanner(System.in);
        String pesquisa = leitor.nextLine();
        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome like ?";


        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + pesquisa + "&");
        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while(resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo,nome));
        }

        for (Pessoa p: pessoas){
            System.out.println(p.getCodigo() + "==>" + p.getNome());
        }

        stmt.close();
        conexao.close();
    }
}
