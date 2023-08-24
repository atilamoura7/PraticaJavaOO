package atividademapa;

import javax.swing.JOptionPane;

public class ExameTriglicerideo extends Exame
{
    private float triglicerideo;
    public ExameTriglicerideo()
    {
    }
    @Override
    public void cadastrarExame()
    {
        super.cadastrarExame();
        setTriglicerideo(Float.parseFloat(JOptionPane.showInputDialog(null, "Quantidade de triglicirídeo: ")));
        classificarResultado();
    }
    @Override
    public void classificarResultado()
    {
        String resultadoTriglicerideo = "";
        int idade;
        idade = idade();
        if((idade>0)&&(idade<=9))
        {
            if(this.getTriglicerideo()<75)
            {
                resultadoTriglicerideo = "BOM";
            }
            else
            {
                resultadoTriglicerideo = "RUIM";
            }
        } else if((idade>=10)&&(idade<=19))
        {
            if(this.getTriglicerideo()<90)
            {
                resultadoTriglicerideo = "BOM";
            }
            else
            {
                resultadoTriglicerideo = "RUIM";
            }
        } else
        {
            if(this.getTriglicerideo()<150)
            {
                resultadoTriglicerideo = "BOM";
            }
            else
            {
                resultadoTriglicerideo = "RUIM";
            }
        }
        String retorno = "Nome: "+this.getNomePaciente()+"\nResultado Triglicerídeo: "+this.getTriglicerideo()+"\nClassificação: "+resultadoTriglicerideo;
        mostrarResultado(retorno);
    }
    @Override
    public void mostrarResultado(String retorno)
    {
        JOptionPane.showMessageDialog(null,retorno);
    }
     public void setTriglicerideo(float triglicerideo)
    {
        this.triglicerideo = triglicerideo;
    }
    public float getTriglicerideo()
    {
        return this.triglicerideo;
    }
}
