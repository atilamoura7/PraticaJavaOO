package locacao;

import java.util.Scanner;

public class Progama 
{
    public static void main(String[] args) {
        int opcao;
        Dvd dvd;
        Cds cds;
        while(true)
        {
            System.out.println("");
            System.out.println("------------------------------------------------");
            System.out.println("Digite 0 para sair ou a opção abaixo: ");
            System.out.println("1 - Cadastrar DVD"+" 2 - Emprestar  DVD"+" 3 - Devolver DVD");
            System.out.println("4 - Cadastrar CDS"+" 5 - Vender Cd"+" 6 - Imprimir CDs");
            System.out.print("Opcão: ");
            Scanner scan = new Scanner(System.in);
            opcao = scan.nextInt();
            System.out.println("------------------------------------------------");
            System.out.println("");
            if(opcao==0)
            {
                System.exit(0);
            }
            switch(opcao)
            {
                case 1:
                    dvd = Dvd.getInstance();
                    dvd.cadastrar();
                    break;
                case 2:
                    dvd = Dvd.getInstance();
                    dvd.emprestar();
                    break;
                case 3:
                    dvd = Dvd.getInstance();
                    dvd.devolver();
                    break;
                case 4:
                    cds = Cds.getInstance();
                    cds.cadastrar();
                    break;
                case 5:
                    cds = Cds.getInstance();
                    cds.vender();
                    break;
                case 6:
                    cds = Cds.getInstance();
                    cds.imprimir();
                    break;
            }
        }
    }
   
}
