package locacao;
import java.util.Scanner;
public class Alugar
{
    private Pessoa locatario;
    private Carro veiculo;
    private int dias;
    private float valorF;
    Scanner t = new Scanner(System.in);
    public Alugar (Pessoa locatario, Carro veiculo)
    {
       this.setLocatario(locatario);
       this.setVeiculo(veiculo);
       contratar();
    }
    public void Status()
    {
        System.out.println("Locatario: "+ this.locatario.getNome());
        System.out.println("Carro: " + this.veiculo.getModelo());
    }
    public void setLocatario(Pessoa l)
    {
        this.locatario = l;
    }
    public Pessoa getLocatario()
    {
        return this.locatario;
    }
    public void setVeiculo(Carro v)
    {
        this.veiculo = v;
    }
    public Carro getVeiculo()
    {
        return this.veiculo;
    }
    public void setDias(int d)
    {
        this.dias=d;
    }
    public int getDias()
    {
        return this.dias;
    }
    public void setValorF(float vf)
    {
        this.valorF = vf;
    }
    public float getValorF()
    {
        return this.valorF;
    }
    public void contratar()
    {
        if (this.locatario.getIdade()>=18)
        {
            this.veiculo.setDisponivel(false);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Contrato pode ser assinado "+this.locatario.getNome()+'!');
            System.out.println("Valor cobrado por dia R$70(*apartir de 5 dias terá o desconto de 7%)."); 
            System.out.print("Informe o total de dias: ");
            int d = t.nextInt();
            this.setDias(d); 
            calcAluguel();
        }
        else
        {
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println( this.locatario.getNome()+", idade abaixo do permitido para alugar o veiculo placa: "+ this.veiculo.getPlaca());
            System.out.println("-----------------------------------------------------------------------");
        }
    }
    public void cancelarContrato()
    {
            this.veiculo.setDisponivel(true);
            System.out.println("contrato encerrado!");
    }
    public void calcAluguel()
    {
            float valor =0;
            float desc =0;
            System.out.println();
            if (this.getDias()>=5)
            {
                valor = this.getDias() * (float)70;
                desc = valor *((float)7/(float)100);
                valor = valor - desc;
                this.setValorF(valor);
            }
            else 
            {
                valor = this.getDias() * (float)70;
                this.setValorF(valor);
            }
            System.out.println("total de dias contratados: "+ this.getDias()+",valor do contrato: R$" + this.getValorF());
            System.out.println("--------------------------------------------------------------------");
    }
   
}
