package produtomodel;

public class Produto
{
    private Long id;
    private String nome;
    private Double valorVenda, valorCusto;
    private Integer quantidade;
    public Long getId()
    {
       return this.id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Double getValorVenda()
    {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda)
    {
        this.valorVenda = valorVenda;
    }

    public Double getValorCusto()
    {
        return valorCusto;
    }

    public void setValorCusto(Double valorCusto)
    {
        this.valorCusto = valorCusto;
    }

    public Integer getQuantidade()
    {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade)
    {
        this.quantidade = quantidade;
    }
    
}