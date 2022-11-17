package projetofinal;

class Interface extends BancoDeDados
{
    public void buscarProduto(String nome)
    {
        //...
    }
    public void buscarProduto(int codigo)
    {
        //...
    }
    public void exibirProdutos ()
    {
        //...
    }
    public void loginNome (String nomeUsuario, String senha)
    {
        //...
    }
    public void loginEmail (String eMailUsario, String senha)
    {
        //...
    }
    public void cadastroCliente()
    {
        Cliente novoCliente = new Cliente();
    }
    public void cadastroGerente()
    {
        Gerente novoGerente = new Gerente();
    }
}