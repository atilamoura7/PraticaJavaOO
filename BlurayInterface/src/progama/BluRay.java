package progama;
//import progama.ItemBluRay;
import java.util.Scanner;
import java.util.Vector;
public class BluRay implements InterfaceBluRay
{
    Vector<ItemBluRay> listaBluRay = new Vector<ItemBluRay>();

    public Vector<ItemBluRay> getListaBluRay() {
        return listaBluRay;
    }

    public void setListaBluRay(Vector<ItemBluRay> listaBluRay) {
        this.listaBluRay = listaBluRay;
    }
    @Override
    public void AdicionarLista(ItemBluRay obj)
    {
        this.listaBluRay.add(obj);
    }
    @Override
    public void imprimirLista()
    {
        System.out.println("Lista de Blu-Rays");
        for(int i=0; i<listaBluRay.size(); i++)
        {
            System.out.println("");
            System.out.print("Nome: ");
            System.out.println(this.listaBluRay.get(i).getNomeCliente());
            System.out.println("Preço do Blu-Ray: ");
            System.out.print(this.listaBluRay.get(i).getPreco());
            System.out.println("");
        }
        System.out.println(".............");
        System.out.println("");
    }
    public void cadastrarBluRay(ItemBluRay obj)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        obj.setNomeCliente((scan.nextLine()));
        System.out.print("Valor do Blu-Ray: ");
        obj.setPreco((scan.nextDouble()));
    }
}
