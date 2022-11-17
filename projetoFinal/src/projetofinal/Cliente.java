package projetofinal;

class Cliente extends Usuario
{

    public Cliente() {
    }

    public Cliente(String nomeUsuario, String cpfUsuario, String eMail, String telefone, String senha) {
        super(nomeUsuario, cpfUsuario, eMail, telefone, senha);
    }
    
    public void adicionarProduto (int codigo)
    {
        //adicionar porduto [codigo] no carrinho
    }

    public void adicionarProdutoCustomizado ()
    {
        //criar novo produto customizado
    }

}