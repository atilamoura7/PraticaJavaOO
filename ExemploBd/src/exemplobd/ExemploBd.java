package exemplobd;
import dao.UsuarioDao;
import entity.Usuario;

public class ExemploBd
{
    public static void main(String[] args)
    {
        Usuario u  = new Usuario();
        u.setNome("Moura");
        u.setLogin("atilamouora7");
        u.setSenha("123456789");
        u.setEmail("atilamoura.jm@gmail.com");
        UsuarioDao.cadastrarUsuario(u);
    }
    
}
