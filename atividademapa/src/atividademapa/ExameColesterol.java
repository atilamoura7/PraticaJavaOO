package atividademapa;

import javax.swing.JOptionPane;

public class ExameColesterol extends Exame
{
    private float quantidadeLdl;
    private float quantidadeHdl;
    private String risco;
    public ExameColesterol()
    {
        
    }
    @Override
    public void cadastrarExame()
    {
        super.cadastrarExame();
        setQuantidadeLdl(Float.parseFloat(JOptionPane.showInputDialog(null, "Quantidade de LDL: ")));
        setQuantidadeHdl(Float.parseFloat(JOptionPane.showInputDialog(null, "Quantidade de HDL: ")));
        setRisco(JOptionPane.showInputDialog(null, "Risco (A-Alto, M-Médio, B - Baixo): "));
        classificarResultado();
    }
    @Override
    public void classificarResultado()
    {
        String resultadoHdl = "";
        String resultadoLdl = "";
        int idade;
        idade = idade();
        if((idade>0)&&(idade<=19))
        {
            if(this.getQuantidadeHdl()>45)
            {
              resultadoHdl = "BOM";
            }
            else 
            {
             resultadoHdl = "RUIM";
            }
        } else if(idade >= 20)
        {
            if(this.getQuantidadeHdl() > 40)
            {
               resultadoHdl = "BOM";
            }
            else 
            {
              resultadoHdl = "RUIM";
            }
        }
        if(this.getRisco().equalsIgnoreCase("b"))
        {
            if(this.getQuantidadeLdl()<100)
            {
                resultadoLdl = "BOM";
            }
             else
            {
            resultadoLdl = "RUIM";
            }
        }
        if(this.getRisco().equalsIgnoreCase("m"))
        {
            if(this.getQuantidadeLdl()<70)
            {
               resultadoLdl = "BOM";
            }
            else
            {
              resultadoLdl = "RUIM";
            }
        }
        if (this.getRisco().equalsIgnoreCase("a"))
        {
            if(this.getQuantidadeLdl()<50)
            {
               resultadoLdl = "BOM";
            }
            else
            {
               resultadoLdl = "RUIM";
            }
        }
        String retorno = "Nome: "+this.getNomePaciente()+"\nResultado LDL: "+this.getQuantidadeLdl()+"\nResultado HDL: "+this.getQuantidadeHdl()+"\nResultado Risco: "+this.getRisco()+"\nClassificação\nHdl: "+ resultadoHdl +"\nLdl: "+resultadoLdl;
        mostrarResultado(retorno);
    }
    @Override
    public void mostrarResultado(String retorno) 
    {
          JOptionPane.showMessageDialog(null,retorno);
    }
    public void setQuantidadeLdl(float quantidadeLdl)
    {
        this. quantidadeLdl =  quantidadeLdl;
    }
     public float getQuantidadeLdl()
    {
        return this. quantidadeLdl;
    }
    public void setQuantidadeHdl(float quantidadeHdl)
    {
        this. quantidadeHdl =  quantidadeHdl;
    }
    public float getQuantidadeHdl()
    {
        return this. quantidadeHdl;
    }
    public void setRisco(String risco)
    {
        this.risco = risco;
    }
    public String getRisco()
    {
        return risco;
    }
}
        
