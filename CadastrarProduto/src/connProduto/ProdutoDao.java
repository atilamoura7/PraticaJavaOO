package connProduto;
import java.sql.PreparedStatement;
import connProduto.Conexao;
import produtomodel.Produto;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ProdutoDao
{
    public static void cadastrarProduto(Produto produto)
    {
        String sql = "INSERT INTO PRODUTO(NOME, VALOR_CUSTO, VALOR_VENDA, QUANTIDADE) VALUES(?,?,?,?)";
        PreparedStatement ps = null;
        try
        {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1,produto.getNome());
            ps.setDouble(2,produto.getValorCusto());
            ps.setDouble(3, produto.getValorVenda());
            ps.setInt(4, produto.getQuantidade());
            ps.execute();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel salvar os dados no banco, exceção" +e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
           try
           {
               ps.close();
           }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Não foi possivel encerrar o serviço, exceção" +e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
