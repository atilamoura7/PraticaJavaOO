package locacao;
import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa
{
    protected String nome;
    protected int idade;
    protected String cpf;
    private static ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();
    public Pessoa()
    {
    }
    public Pessoa (String nome, int idade, String cpf)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf =cpf;
        pessoasCadastradas.add(this);
    }
    public void cadastrarPessoa()
    {
        Scanner t = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("--- CADASTRO CLIENTE ---");
        System.out.print("Digite seu nome: ");
        this.setNome(t.nextLine());
        System.out.print("Informe sua idade: ");
        this.setIdade(t.nextInt());
        System.out.print("Informe seu cpf: ");
        this.setCpf(t.next());
        System.out.println("------------------------");
        pessoasCadastradas.add(this);
    }
    public static void pessoasCadastradas()
    {
        for(int i =0; i<pessoasCadastradas.size();i++)
        {
            System.out.println((i+1)+" "+pessoasCadastradas.get(i));
        }
    }
    @Override
    public String toString() 
    {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", cpf=" + cpf+'}';
    }
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    public String getCpf()
    {
        return cpf;
    }
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    public static void setPessoasCadastradas(ArrayList<Pessoa> pessoa)
    {
        Pessoa.pessoasCadastradas = pessoa;
    }
    public static ArrayList<Pessoa> getPessoasCadastradas()
    {
        return pessoasCadastradas;
    }
}
