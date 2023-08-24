package atividademapa;

import javax.swing.JOptionPane;

public class ExameGlicemia extends Exame
{
    private float quantidadeDeGlicose;
    public ExameGlicemia()
    {
        
    }
    public ExameGlicemia(String nomePaciente, String tipoSanguineo, int anoNascimento, float quantidadeDeGlicose)
    {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.setQuantidadeDeGlicose(quantidadeDeGlicose);
    }   

    @Override
    public void setAnoNascimento(int anoNascimento) {
        super.setAnoNascimento(anoNascimento); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    @Override
    public void cadastrarExame()
    {
        super.cadastrarExame();
        setQuantidadeDeGlicose(Float.parseFloat(JOptionPane.showInputDialog(null, "Quantidade de glicose: ")));
        classificarResultado();
    }
    @Override
    public void classificarResultado()
    {
        String retorno = "";
        String resultadoGlicemia = ""; 
        if(this.getQuantidadeDeGlicose()>=126)
        {
            resultadoGlicemia ="\nClassificação: Diabetes estabelecido";
        } 
        else if(this.getQuantidadeDeGlicose()>=100)
        {
            resultadoGlicemia ="\nClassificação: Pré-diabetes";
        }
        else 
        {
           resultadoGlicemia = "\nClassificação: Normoglicemia";
        }
        retorno = "Nome: "+this.getNomePaciente()+"\nResultado: "+this.getQuantidadeDeGlicose()+resultadoGlicemia;
        mostrarResultado(retorno);
    }
    @Override
    public void mostrarResultado(String retorno)
    {   
        JOptionPane.showMessageDialog(null,retorno);
    }
    public void setQuantidadeDeGlicose(float quantidadeDeGlicose)
    {
        this.quantidadeDeGlicose = quantidadeDeGlicose;
    }
    public float getQuantidadeDeGlicose()
    {
        return this.quantidadeDeGlicose;
    }
}
