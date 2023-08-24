package partidaprincipal;
class Clube 
{
    private String nome;
    private int titulos;
    private String estadio;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Clube(String nome, int titulos, int vitorias, int derrotas, int empates)
    {
        this.nome = nome;
        this.titulos = titulos;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    @Override
    public String toString() 
    {
        return "Clube{" + "nome: " +this.getNome()+ ", vitorias: "+this.getVitorias()+", derrotas: "+this.getDerrotas()+", empates: " +this.getEmpates();
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getTitulos()
    {
        return titulos;
    }
    public void setTitulos(int titulos)
    {
        this.titulos = titulos;
    }


    public int getVitorias()
    {
        return vitorias;
    }

    public void setVitorias(int vitorias)
    {
        this.vitorias = vitorias;
    }

    public int getDerrotas()
    {
        return derrotas;
    }

    public void setDerrotas(int derrotas)
    {
        this.derrotas = derrotas;
    }

    public int getEmpates()
    {
        return empates;
    }

    public void setEmpates(int empates)
    {
        this.empates = empates;
    }
    
    public void ganhar()
    {
        this.setVitorias(this.getVitorias()+1);
    }
    public void perder()
    {
         this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatar()
    {
         this.setEmpates(this.getEmpates()+1);
    }
    public void campeao()
    {
        this.setTitulos(this.getTitulos()+1);
    }
}
