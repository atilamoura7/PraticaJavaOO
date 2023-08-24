package partidaprincipal;
public class PartidaPrincipal 
{
    public static void main(String[] args) 
    {
      Time a = new Time("Flamengo", 50, 10, 0, 1, "Maracana");
      Time b = new Time ("Real madrid", 90, 12, 1, 0, "Santiago Bernabeu");
      Partida p = new Partida (a, b);
      p.iniciar();
      p.gol(a);
      p.gol(a);
      p.gol(b);
      p.gol(b);
      p.fimPart();
      System.out.println(a.toString());
      System.out.println(b.toString());
    
    }
    
}
