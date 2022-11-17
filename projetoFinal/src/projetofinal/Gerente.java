package projetofinal;

class Gerente extends Usuario
{

    public Gerente() {
    }

    public Gerente(String nomeUsuario, String cpfUsuario, String eMail, String telefone, String senha) {
        super(nomeUsuario, cpfUsuario, eMail, telefone, senha);
    }
    
    public void adicionarProduto ()
    {
        //cria um produto e adiciona ele no banco de dados
    }


    public void alterarProduto (int codigo)
    {
        //busca um porduto atravez de seu cogigo e altera suas informações
    }

    public void removerProduto (int codigo)
    {
        // removo produto com codigo = codigo
    }

    public void adicionarFilamemto ()
    {
        //cria um filamento e adiciona no banco de dados
    }

    public void removerFilamento (int codigo)
    {
        //remove filamento com codigo = codigo do banco de dados
    }

    public void adicionarModelo ()
    {
        //cria um modelo e adiciona no banco de dados
    }

    public void removerModelo (int codigo)
    {
        //remove modelo com codigo = codigo do banco de dados
    }

    public double totalVendas ()
    {
        //return soma de histoco de compra de todos os carrinhos
        return 0.0;
    }

    public int qtdeVendas()
    {
        // retorna o total de porduto comprados por todos carrinhos
        return 0;
    }

}