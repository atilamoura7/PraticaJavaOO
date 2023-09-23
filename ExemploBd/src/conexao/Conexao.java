package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Conexao
{
    private static final String URL = "jdbc:mysql://localhost:3306/exemplobd";
    private static final String USER = "root";
    private static final String PASSWORD= "root";
    private static Connection conn;
    public static Connection getConexao() 
    {
        try 
        {
            if(conn==null)
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER,PASSWORD);
                return conn;
            }else
            {
                return conn;
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Exceção: "+e,"ERRO DE CONEXÃO", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}

