package dao;
import conexao.Conexao;
import entity.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class UsuarioDao
{
    public static void cadastrarUsuario(Usuario usuario)
    {
        String sql = "INSERT INTO USUARIO ( NOME, LOGIN, SENHA, EMAIL) values (?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Exceção: "+e,"ERRO DE CONEXÃO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
