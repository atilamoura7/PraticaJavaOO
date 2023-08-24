package partidaprincipal;
public class Time extends Clube
{
    private String estadio;
    public Time(String nome, int titulos, int vitorias, int derrotas, int empates, String estadio)
    {
        super(nome, titulos, vitorias, derrotas, empates);
        this.setEstadio(estadio);
    }

    @Override
    public String toString()
    {
        return super.toString()+", estadio: " +this.getEstadio()+ '}';
    }
    public void setEstadio(String es)
    {
        this.estadio = es;
    }
    public String getEstadio()
    {
        return this.estadio;
    }
}
