package aula14;
public class Gafanhoto extends Pessoa
{
    private String login;
    private int totAssistido;

    public Gafanhoto(String l, String n, String s, int id) {
        super(n, s, id);
        this.login = l;
        this.totAssistido = 0;
    }
    
    public void setLogin(String l)
    {
        this.login = l;
    }
    public String getLogin()
    {
        return this.login;
    }
    public void setTotAssistido(int ta)
    {
        this.totAssistido = ta;
    }
    public int getTotAssistido()
    {
        return this.totAssistido;
    }
    public void viuMaisUm()
    {
        this.setTotAssistido(this.getTotAssistido()+1);
    }

    @Override
    public String toString() 
    {
        return "Gafanhoto{"+ super.toString() + ", totAssistido=" + totAssistido + " login=" + login+ '}';
    }
}
