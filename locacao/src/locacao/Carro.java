package locacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Carro
{
    private String modelo;
    private int qtdPortas;
    private String placa;
    private boolean disponivel;
    private static ArrayList<Carro> carrosCadastrados = new ArrayList<Carro>();
    public Carro(String modelo, int portas,String placa)
    {
        //cadastrarCarro();
        this.setModelo(modelo);
        this.setQtdPortas(portas);
        this.setPlaca(placa);
        this.setDisponivel(true);
        carrosCadastrados.add(this);
    }
    public static void carrosCadastrados()
    {
        for(int i =0; i<carrosCadastrados.size();i++)
        {
            System.out.println((i+1)+" "+carrosCadastrados.get(i));
        }
    }
    public Carro escolheCarro()
    {
        
        Scanner tec = new Scanner(System.in);
        System.out.println("informe o número do veiculo da sua escolha: ");
        String escolha = tec.nextLine();
    	int index = Integer.parseInt(escolha);
        Carro carro = null;
    	if(carrosCadastrados.get(index).isDisponivel())
    	{
	    switch(index)
	    {
                case 1:
	    	    carro = carrosCadastrados.get(0);
	    	    carrosCadastrados.get(0).setDisponivel(false);
	        break;
	    	case 2:
	    	    carro = carrosCadastrados.get(1);
	    	    carrosCadastrados.get(1).setDisponivel(false);
	    	break;
	    	case 3:
	    	    carro = carrosCadastrados.get(2); 
	    	    carrosCadastrados.get(2).setDisponivel(false);
                case 4:
	            carro = carrosCadastrados.get(3); 
                    carrosCadastrados.get(3).setDisponivel(false);;
	    	break;
	    	default:
                	System.out.println("Escolha um número válido!");
	    	break;
	    	}
	    	return retornaCarroEscolhido(carro);
    	}
    	else
    	{
    		System.out.println("Carro não está disponível para locação");
    		return carro;
    	}
    }
    public static Carro retornaCarroEscolhido(Carro carro)
    {
    	
    	System.out.println("Modelo: " + carro.getModelo() + ", Placa: " + carro.getPlaca() + ", Portas: " + carro.getQtdPortas());
	return carro;
    	
    }
    public void cadastrarCarro()
    {
        Scanner tec = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("--- DADOS DO VEÍCULO ---");
        System.out.print("Informe o modelo: ");
        this.setModelo(tec.next());
        System.out.print("informe a quantidade de portas: ");
        this.setQtdPortas(tec.nextInt());
        System.out.print("informe a placa do veículo: ");
        this.setPlaca(tec.next());
        carrosCadastrados.add(this);
        System.out.println("--------------------------");
    } 
    @Override
    public String toString() 
    {
        return "Carro{" + "marca: " + this.getModelo() +", placa: " + this.getPlaca() + ", disponivel "+ this.isDisponivel()+'}';
    }
    
    public void setModelo(String m)
    {
        this.modelo = m;
    }
    public String getModelo()
    {
        return this.modelo;
    }
    public void setQtdPortas(int p)
    {
        this.qtdPortas = p;
    }
    public int getQtdPortas()
    {
        return this.qtdPortas;
    }
    public void setPlaca(String p)
    {
        this.placa = p;
    }
    public String getPlaca()
    {
        return this.placa;
    }
    public void setDisponivel(boolean d)
    {
        this.disponivel = d;
    }
    public boolean isDisponivel()
    {
        return this.disponivel;
    }
    public static ArrayList<Carro> getCarrosCadastrados() {
        return carrosCadastrados;
    }
    public static void setCarrosCadastrados(ArrayList<Carro> carrosCadastrados) {
        Carro.carrosCadastrados = carrosCadastrados;
    }
}
