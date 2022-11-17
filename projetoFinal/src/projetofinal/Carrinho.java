package projetofinal;

import java.util.ArrayList;

class Carrinho
{
    private ArrayList<Produto> produtos;
    private ArrayList<ProdutoCustomizado> produtosCustomizados;
    private ArrayList<Produto> historicoCompraProuto;
    private ArrayList<ProdutoCustomizado> historicoCompraProdutoCustomizados;
    
    
    
    public void exibirCarrinho ()
    {
        //mostra todos dados dos vetores produtos e produtosCustomizados
    }
    public void exibirHistorico ()
    {
        //mostra todos dados dos vetores historicoPorsuto e historicoProdutoCustomizados
    }
    public void removerProdutoCarrinho (String nome)
    {
        //remove um produto de nome= nome do vetor de produtos 
    }
    public void removerProdutoCustomizadoCarrinho (String nome)
    {
        //remove um produtoCustomizado de nome = nome do vetor de produtosCustomizados
    }
    public double totalPrecoProdutos()
    {
        int soma = 0;
        return soma;
        //retorna soma do preco de todos produtos e pordutosCustomizados
    }
    public void comprarProduto (String nome)
    {
        //compra um produto, remove ele da lista de produto e adiciona na lista historio de pordutos
    }
    public void comprarTudo()
    {
        //compra todos os produtos e adiciona eles em historico
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<ProdutoCustomizado> getProdutosCustomizados() {
        return produtosCustomizados;
    }
    public void setProdutosCustomizados(ArrayList<ProdutoCustomizado> produtosCustomizados) {
        this.produtosCustomizados = produtosCustomizados;
    }

    public ArrayList<Produto> getHistoricoCompraProuto() {
        return historicoCompraProuto;
    }
    public void setHistoricoCompraProuto(ArrayList<Produto> historicoCompraProuto) {
        this.historicoCompraProuto = historicoCompraProuto;
    }

    public ArrayList<ProdutoCustomizado> getHistoricoCompraProdutoCustomizados() {
        return historicoCompraProdutoCustomizados;
    }
    public void setHistoricoCompraProdutoCustomizados(ArrayList<ProdutoCustomizado> historicoCompraProdutoCustomizados) {
        this.historicoCompraProdutoCustomizados = historicoCompraProdutoCustomizados;
    }
}