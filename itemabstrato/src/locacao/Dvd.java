package locacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dvd extends ItemAbstrato
{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Dvd()
    {
        
    }
    @Override
    public void cadastrar()
    {
        this.setCodigo(1);
        this.setTitulo("Senhor dos aneis");
        this.setSituacaoItem("L");
        System.out.println("Dvd cadastardo "+" - Cod: "+ this.getCodigo()+" - Titulo: "+ this.getTitulo()+" - Situação: "+this.getSituacaoItem());
        System.out.println("Dvd Cadastardo usando o método abstrato, herdado da classe abstrata ItemAbstato");
    }

    @Override
    public void emprestar()
    {
        this.setSituacaoItem("E");
        this.setDataEmprestimo(sdf.format(new Date()));
         System.out.println("Dvd emprestado "+" - Situação: "+this.getSituacaoItem()+" - Data emprestimo: "+this.getDataEmprestimo());
         System.out.println("Dvd emprestado usando o método abstrato, herdado da classe abstrata ItemAbstato");
    }

    @Override
    public void devolver()
    {
         this.setSituacaoItem("L");
         this.setDataDevolucao(sdf.format(new Date()));
         System.out.println("Dvd devolvido "+" - Situação: "+this.getSituacaoItem()+" - Data devoluçao: "+this.getDataDevolucao());
         System.out.println("Dvd devolvido usando o método abstrato, herdado da classe abstrata ItemAbstato");
    }
    public void imprimir()
    {
        System.out.println("Imprimir Lista de DVDS utilizando método concreto da classe DVD");
    }
    public static Dvd getInstance()
    {
        return new Dvd();
    }
}
