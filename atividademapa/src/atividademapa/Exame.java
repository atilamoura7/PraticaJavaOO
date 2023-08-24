package atividademapa;

import javax.swing.JOptionPane;

public abstract class Exame 
{
    private String nomePaciente, tipoSanguineo;
    private int anoNascimento;
    public Exame()
    {
        cadastrarExame();
    }
    public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento)
    {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }
    
    public void cadastrarExame()
    {
        setNomePaciente(JOptionPane.showInputDialog(null, "Digite seu nome: "));
        setTipoSanguineo(JOptionPane.showInputDialog(null, "Digite seu tipo sanguíneo: "));
        setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu ano de nascimento: ")));
    }
    public abstract void classificarResultado();
    public abstract void mostrarResultado(String retorno);
    public String getNomePaciente()
    {
        return this.nomePaciente;
    }
    public void setNomePaciente(String nomePaciente)
    {
        this.nomePaciente = nomePaciente;
    }
    public String getTipoSanguineo()
    {
        return this.tipoSanguineo;
    }
    public void setTipoSanguineo(String tipoSanguineo)
    {
        this.tipoSanguineo = tipoSanguineo;
    }
    public int getAnoNascimento()
    {
        return this.anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento)
    {
        this.anoNascimento = anoNascimento;
    }
    public int idade()
    {
        int idade = 2023 - this.getAnoNascimento();
        return idade;
    }
}
