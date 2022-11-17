package projetofinal;

class Produto extends Modelo
{
    protected int codigo;
    private String nome;
    private double preco;

    Produto()
    {
        if(codigo != 0.0)
        {
            if(nome != null)
            {
                if(preco != 0.0)
                {
                    Produto novoProduto = new Produto();
                }
            }
        }
    }
    Produto(int codigo, String nome, double preco)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

}