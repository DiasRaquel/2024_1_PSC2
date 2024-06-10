import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploJDBC {

    public static void main(String[] args) {
        Connection conexao = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecer uma conexão com o banco de dados
            conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/seuBancoDeDados", "seuUsuario", "suaSenha");

            // Criar um Statement para executar SQL
            stmt = conexao.createStatement();

            // Executar uma consulta SQL e obter os resultados
            String sql = "SELECT * FROM Pao";
            rs = stmt.executeQuery(sql);

            // Processar o ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                String tipo = rs.getString("tipo");
                double preco = rs.getDouble("preco");
                System.out.println("ID: " + id + ", Tipo: " + tipo + ", Preço: " + preco);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar ResultSet, Statement e Connection
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

