package aula14;
public abstract class Pessoa 
{
    protected String nome, sexo;
    protected int idade,experiencia ;
    public Pessoa(String n, String s, int id)
    {
        this.nome = n;
        this.sexo = s;
        this.idade = id;
        this.experiencia=0;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", experiencia=" + experiencia + '}';
    }
    
    public void setNome(String n)
    {
        this.nome=n;
    }
     public String getNome()
    {
        return this.nome;
    }
     public void setSexo(String s)
    {
        this.sexo=s;
    }
     public String getSexo()
    {
       return this.sexo;
    }
      public void setExperiencia(int e)
    {
        this.experiencia=e;
    }
    public int getExperiencia()
    {
        return this.experiencia;
    }
    public void setIdade(int id)
    {
        this.idade=id;
    }
    public int getIdade()
    {
       return this.idade;
    }
    protected void ganharExperiencia()
    {
       this.setExperiencia(this.getExperiencia()+1);
    }
}
