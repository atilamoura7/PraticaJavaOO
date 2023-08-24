package locacao;
import static locacao.Carro.carrosCadastrados;
import static locacao.Pessoa.pessoasCadastradas;

public class Locacao
{
    public static void main(String[] args)
    {
        Pessoa p1 = new Pessoa("Joe", 24,"123.555.444-00");
        Pessoa p2 = new Pessoa("rick", 22,"000.555.123-00");
        pessoasCadastradas();
        Carro c1 = new Carro("CIVIC", 4, "TNT 4555");
        Carro c2 = new Carro("GOLF", 4, "XCQ 5641");
        System.out.println("");
        carrosCadastrados();
        Alugar a1 = new Alugar(p1, c1);
        Alugar a2 = new Alugar(p2, c2);
    }
}