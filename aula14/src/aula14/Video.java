package aula14;
public class Video implements AcoesVideo
{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    public Video (String t)
    {
        this.titulo = t;
        this.avaliacao = 0;
        this.views =  0;
        this.curtidas = 0;
        this.setReproduzindo(false);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    public void setTitulo(String t)
    {
        this.titulo = t;
    }
    public String getTitulo()
    {
        return this.titulo;
    }
    public void setAvaliacao(int av)
    {
        int nova;
        nova = (this.avaliacao + av)/this.views;
        this.avaliacao = nova;
    }
    public int getAvaliacao()
    {
        return this.avaliacao;
    }
    public void setViews(int v)
    {
        this.views = v;
    }
    public int getViews()
    {
        return this.views;
    }
    public void setCurtidas(int c)
    {
        this.curtidas = c;
    }
    public int getCurtidas()
    {
        return this.curtidas;
    }
    public void setReproduzindo(boolean r)
    {
        this.reproduzindo = r;
    }
    public boolean getReproduzindo()
    {
        return this.reproduzindo;
    }
    @Override
    public void play()
    {
        if (this.getReproduzindo()==false)
        {
            this.setReproduzindo(true);
            System.out.println("play");
        }
        else
        {
            System.out.println("video ja esta reproduzindo!");   
        }
    }
     @Override
    public void pause()
    {
        if (this.getReproduzindo()== true)
        {
            this.setReproduzindo(false);
            System.out.println("pause!");
        }
        else
        {
            System.out.println("pause ja ativo!");   
        }
}
    @Override
    public void like()
    {   
        if (this.getReproduzindo()==true)
        {
            this.setCurtidas(this.getCurtidas()+1);
            System.out.println("curtida registrada");
        }
        else 
        {
            System.out.println("video precisa estar reproduzindo!");
        }
    }
    
}
