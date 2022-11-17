package projetofinal;

class Cliente extends Usuario
{

    Cliente(int codigo, String nomeUsuario, String cpfUsuario, String eMail, String telefone, String senha) {
        super(codigo, nomeUsuario, cpfUsuario, eMail, telefone, senha);
    }

    public void adicionarProduto (int codigo)
    {
        //carrinho recebe produto referente ao codigo
    }

    public void adicionarprodutoCustomizado ()
    {
        //criarProdutoCustomizado ();
    }
}