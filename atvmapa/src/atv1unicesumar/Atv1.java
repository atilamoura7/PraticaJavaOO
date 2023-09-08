package atv1unicesumar;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Atv1 
{
    public static void main(String[] args)
    {          
        try
        {
            int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
        }
        catch(NumberFormatException e)
        {
            //Tratamento para o caso de o usúario inserir algo diferente de um número.
            JOptionPane.showMessageDialog(null,"Insira um número inteiro válido para a quantidade de alunos: "+e);
        }
        try 
        {            
            Produto p = null;
            p.getDescr();   
        }     
        catch (NullPointerException e)
        {
            //Tratamento do erro no momento de execução pois objeto aponta para uma posiçao null na memória.
            JOptionPane.showMessageDialog(null,"Não foi possível acessar a descriçao do Produto. \nExceção: "+e);
        }
        try
        {
            List<String> palavras = new ArrayList<>();
            palavras.add("Oi");
            palavras.add("Tchau");
            palavras.remove(2);
        }
        catch(IndexOutOfBoundsException e)
        {
            //Fazendo o tratamento para o caso do usúario tentar acessar um indice não existente na lista. 
            JOptionPane.showMessageDialog(null,"Indice não encontrado no comprimento da Lista: "+e);
        }  
       }
}
