package connProduto;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexao
{
    private static final String URL ="jdbc:mysql://localhost:3306/cadastro";
    private static final String USER ="root";
    private static final String PASSWORD="root";
    private static Connection conn=null;
    public static Connection getConexao()
    {
        try
        {
            if(conn==null)
            {
                conn=DriverManager.getConnection(URL, USER, PASSWORD);
                return conn;
            }
            else
            {
                return conn;
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel estabelecer conexão, exception: "+e,"Erro na conexão",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        /*finally
        {
            try
            {
                if (conn != null)
                {
                    conn.close();
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Não foi possivel encerrar a conexão, Exceção: "+e,"Erro", JOptionPane.ERROR_MESSAGE);
            }
        }*/
    }
}
