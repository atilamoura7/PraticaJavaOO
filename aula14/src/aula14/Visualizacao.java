package aula14;
public class Visualizacao 
{
    private Gafanhoto espectador;
    private Video filme;
    // aula 15
    public Visualizacao(Gafanhoto e, Video f)
    {
        this.setEspectador(e);
        this.setFilme(f);
        this.filme.setViews(this.filme.getViews()+1);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
    }
    public void setEspectador(Gafanhoto e)
    {
        this.espectador = e ;
    }
    public Gafanhoto getEspectador()
    {
        return this.espectador;
    }
    public void setFilme(Video f)
    {
        this.filme = f;
    }
    public Video getFilme()
    {
        return this.filme;
    }
    public void avaliar()
    {
        this.filme.setAvaliacao(5);
    }
     public void avaliar(int n)
    {
        this.filme.setAvaliacao(n);
    }
    public void avaliar(float porc)
    {
        int tot = 0;
        if(porc <= 20)
        {
            tot = 3;
        }
        else if (porc <=50)
        {
            tot = 5;
        }
        else if (porc <= 90)
        {
             tot = 8;
        }
        else
        {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
}
