package aula14;
public class Aula14 
{
    public static void main(String[] args)
    {
        Video v[] = new Video[2];
        v[0] = new Video("aula 14 java");
        v[1] = new Video ("aula 1 algoritmo");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        v[0].setCurtidas(1);
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("joe", "moura", "m", 24);
        g[1] = new Gafanhoto("ayslla", "yara", "f", 18);
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        Visualizacao a[] = new Visualizacao[2];
        
        a[0] = new Visualizacao(g[0], v[0]);
        a[1] = new Visualizacao(g[1], v[1]);
        a[0].avaliar(10);
        System.out.println("   ");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
       // System.out.println(g[0].toString());
       // System.out.println(g[1].toString());
    }
}
