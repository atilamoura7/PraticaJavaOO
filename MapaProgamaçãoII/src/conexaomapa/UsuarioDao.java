package conexaomapa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexaomapa.Conexao;
import javax.swing.JOptionPane;
import modelmapa.Usuario;
public class UsuarioDao
{
    public static void cadastrarUsuario(Usuario usuario) 
    {
            String sql = "INSERT INTO USUARIO(NOME, LOGIN, SENHA, EMAIL) VALUES(?,?,?,?)";
            PreparedStatement ps = null;
            try
            {
               ps = Conexao.getConexao().prepareStatement(sql);
               ps.setString(1, usuario.getNome());
               ps.setString(2, usuario.getLogin());
               ps.setString(3,  usuario.getSenha());
               ps.setString(4, usuario.getEmail());
               ps.execute();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Não foi possivel realizar o cadastro tente novamente, exceção: "+e,"Erro", JOptionPane.ERROR_MESSAGE);
            }
            finally
            {
                try
                {
                    ps.close();
                }
                catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(null,"Não foi possivel encerrar o uso do serviço, execeção: "+e,"Erro", JOptionPane.ERROR_MESSAGE);
                }
               
            }
    }
    public static Usuario verificandoUsuario(String login, String senha) throws SQLException
    { 
        String sql = "SELECT ID, NOME, LOGIN, SENHA, EMAIL FROM USUARIO WHERE LOGIN = ? AND SENHA = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
           ps = Conexao.getConexao().prepareStatement(sql);
           ps.setString(1, login);
           ps.setString(2, senha);
           rs = ps.executeQuery();
           if(rs.next())
           {
               Usuario usuario = new Usuario();
               usuario.setId(rs.getInt("ID"));
               usuario.setNome(rs.getString("NOME"));
               usuario.setLogin(rs.getString("LOGIN"));
               usuario.setSenha(rs.getString("SENHA"));
               usuario.setEmail(rs.getString("EMAIL"));
               JOptionPane.showMessageDialog(null,"Seja Bem-vindo!","Acesso autorizado", JOptionPane.INFORMATION_MESSAGE);
               return usuario;
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Verifique os dados ou realize seu cadastro!","Acesso negado", JOptionPane.INFORMATION_MESSAGE);
               return null;
           }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel verificar se o Usuário está cadastrado, exceção: "+e,"Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        finally
        {
            try
            {
                ps.close();
                rs.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Não foi possivel encerrar o uso do serviço, execeção: "+e,"Erro", JOptionPane.ERROR_MESSAGE);
            }
          
        }
    }
}
