package progama;

import java.util.Scanner;

public class Progama
{
    public static void main(String[] args)
    {
        BluRay objBluray = new BluRay();
        ItemBluRay objItem;
        while(true)
        {
            objItem = new ItemBluRay();
            System.out.println("1- Cadastrar Blu-Ray");
            System.out.println("2- Imprimir Lista de Blu-Rays");
            System.out.println("3- Cadastrar Blu-Ray com Desconto");
            System.out.println("4- Encerrar");
            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
            if(opcao==4)
            {
                break;
            }
            switch(opcao)
            {
                case 1:
                    objBluray.cadastrarBluRay(objItem);
                    objBluray.AdicionarLista(objItem);
                    break;
                case 2:
                    objBluray.imprimirLista();
                    break;
                case 3:
                    objBluray.cadastrarBluRay(objItem);
                    System.out.println("Valor do Blu-Ray com promoção de: ");
                    System.out.println(InterfaceBluRay.PROMOCAO);
                    double valorDesconto = objItem.getPreco() - (objItem.getPreco()*InterfaceBluRay.PROMOCAO)/100;
                    objItem.setPreco(valorDesconto);
                    objBluray.AdicionarLista(objItem);
                    System.out.println("");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
