package partidaprincipal;
public class Partida implements AcoesPartida
{
    private Time time1;
    private Time time2;
    private int golMan;
    private int golVis;
    private boolean play;

    public Partida(Time time1, Time time2)
    {
        this.setTime1(time1);
        this.setTime2(time2);
        this.setGolMan(0);
        this.setGolVis(0);
        this.setPlay (false);
        status();
    }
    public void status()
    {
        System.out.println("");
        System.out.println("---------PLACAR----------");
        System.out.println("Estádio: "+this.time1.getEstadio());
        System.out.println(this.time1.getNome()+" "+ this.getGolMan()+"x"+ this.getGolVis()+" "+this.time2.getNome());
        System.out.println("------------------------- ");
    }
    public void resultado()
    {
        System.out.println("");
        System.out.println("---------PLACAR----------");
        System.out.println(this.time1.getNome()+" "+ this.getGolMan()+"x"+ this.getGolVis()+" "+this.time2.getNome());
        System.out.println("------------------------- ");
    }
    public Time getTime1() 
    {
        return time1;
    }

    public void setTime1(Time time1)
    {
        this.time1 = time1;
    }

    public Time getTime2() 
    {
        return time2;
    }

    public void setTime2(Time time2) 
    {
        this.time2 = time2;
    }

    public int getGolMan()
    {
        return golMan;
    }

    public void setGolMan(int golMan)
    {
        this.golMan = golMan;
    }

    public int getGolVis()
    {
        return golVis;
    }
    public void setGolVis(int golVis) 
    {
        this.golVis = golVis;
    }

    public boolean isPlay()
    {
        return play;
    }

    public void setPlay(boolean play)
    {
        this.play = play;
    }
    
    public void gol(Time time)
    {
        if (this.isPlay()==true)
        {
            if(this.getTime1()==time)
            {
               this.setGolMan(this.getGolMan()+1);
            }
            else if (this.getTime2()==time)
            {
              this.setGolVis(this.getGolVis()+1);
            }
        } 
        else 
        {
            System.out.println("partida ainda não iniciada! ");
        }
    }

    @Override
    public void tempo1() 
    {
         status();
        System.out.println("inicio do primeiro tempo");
    }

    @Override
    public void tempo2() 
    {
        status();
        System.out.println("inicio do segundo tempo");
    }
    @Override
    public void iniciar()
    {
        this.setPlay(true);
        System.out.println("partida iniciada!");
    }
    @Override
    public void fimPart() 
    {
        if(this.isPlay()==true)
        {
            if (this.getGolMan()>this.getGolVis())
            {
               this.time1.setVitorias(this.time1.getVitorias()+1);
               this.time2.setDerrotas(this.time2.getDerrotas()+1);
            }
            else if (this.getGolVis() >this.getGolMan())
            {
              this.time2.setVitorias(this.time2.getVitorias()+1);
              this.time1.setDerrotas(this.time1.getDerrotas()+1);
            }
            else 
            {
                this.time1.setEmpates(this.time1.getEmpates()+1);
                this.time2.setEmpates(this.time2.getEmpates()+1);
            }
            this.setPlay(false);
           resultado();
        }
        else 
        {
            System.out.println("Ação indisponível!");
        }
        
    }
}
