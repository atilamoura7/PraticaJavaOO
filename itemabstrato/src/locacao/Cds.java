package locacao;
public class Cds extends Dvd
{
    public Cds()
    {
        
    }
    @Override
    public void cadastrar()
    {
        this.setCodigo(1);
        this.setTitulo("The best of joy division");
        this.setSituacaoItem("L");
        System.out.println("CD cadastardo "+" - Cod: "+ this.getCodigo()+" - Titulo: "+ this.getTitulo()+" - Situação: "+this.getSituacaoItem());
        System.out.println("CD Cadastardo usando o método abstrato, herdado da classe abstrata ItemAbstato");
    }
    
    public void imprimir()
    {
        System.out.println("Impressão da Lista de CDs método herdado da classe Dvds");
    }
    public void vender()
    {
        System.out.println("CD vendido utilizando método concreto da classe Cds");
    }
    public static Cds getInstance()
    {
        return new Cds();
    }
}
