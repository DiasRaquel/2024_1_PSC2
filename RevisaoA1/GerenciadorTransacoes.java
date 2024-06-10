import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
    
public class GerenciadorTransacoes {
    
private static final String URL = "jdbc:seuBancoDeDadosAqui";
private static final String USER = "seuUsuario";
private static final String PASSWORD = "suaSenha";
    
    public void realizarTransacao() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            // Desativa o commit automático
            conexao.setAutoCommit(false);
    
            // Operações de banco de dados aqui (inserção, atualização, deleção)
            PreparedStatement stmt1 = conexao.prepareStatement("SUA CONSULTA SQL AQUI");
            // Configurar parâmetros e executar
            stmt1.executeUpdate();
    
            PreparedStatement stmt2 = conexao.prepareStatement("OUTRA CONSULTA SQL AQUI");
            // Configurar parâmetros e executar
            stmt2.executeUpdate();
    
            // Se todas as operações forem bem-sucedidas, confirma a transação
            conexao.commit();
        } catch (SQLException e) {
            try {
                if (conexao != null) {
                // Se houver falha em alguma operação, desfaz todas as operações
                conexao.rollback();
                }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                e.printStackTrace();
            } finally {
                try {
                    if (conexao != null) {
                        conexao.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
    }
}
    
