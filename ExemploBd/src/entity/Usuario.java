package entity;
public class Usuario 
{
    private int codigo;
    private String nome, login, senha, email;

    public Usuario() {
    }

    public Usuario(int codigo, String nome, String login, String senha, String email) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setLogin (login);
        this.setSenha(senha);
        this.setEmail(email);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
