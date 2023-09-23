package conexaomapa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Conexao
{
    private static final String URL = "jdbc:mysql://localhost:3306/mapa";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    public static  Connection conn =null;
    
    public static Connection getConexao()
    {
        try
        {
            if(conn==null)
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                return conn;
            }
            else 
            {
                return conn;
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar conexão, Exceção: "+e,"Erro de conexão", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        catch (ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Classe de conexão não encontrada,exceção: "+e, "Erro",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
