package principal;
import java.util.Scanner;

public class Rota 
{
     public void planejarDia()
     {
        Scanner ler = new Scanner(System.in);
        System.out.print("Infome o total de rotas: ");
        int totRotas = ler.nextInt();
        double totKm = 0;
        double totCombustivel = 0; 
        double vFinal = 0;
        for(int i = 0; i<totRotas; i++)
        {
            System.out.print("Infome o total de km da rota "+(i+1)+": ");
            double km = ler.nextFloat();
            totKm = totKm + km; 
        }
        totCombustivel = totKm/2.5f;
        System.out.print("Informe o valor do diesel em R$: ");
        double valCombustivel = ler.nextFloat();
        vFinal = valCombustivel * totCombustivel;
        System.out.printf("Resultado total de km: %.2f%n", totKm);
        System.out.printf("Total de litros de combustível necessário para atender às rotas: %.2f%n", totCombustivel);
        System.out.printf("Valor total que a empresa desembolsará: R$%.2f%n", vFinal);
    }
}