package projetofinal;

import java.io.File;
import java.util.ArrayList;

class ProdutoCustomizado extends Filamento
{
    private String nome;
    private ArrayList<Filamento> filamentos;
    private ArrayList<File> arquivos;
    private double preco;

    public ProdutoCustomizado criarProdutoCustomizado()
    {
        //passar todos valores pedidos
        ProdutoCustomizado novoProdutoCustomizado = new ProdutoCustomizado();
        return novoProdutoCustomizado;
    }

    ProdutoCustomizado()
    {
        //....
    }

    public ProdutoCustomizado(String nome, ArrayList<Filamento> filamentos, ArrayList<File> arquivos, double preco) {
        this.nome = nome;
        this.filamentos = filamentos;
        this.arquivos = arquivos;
        this.preco = preco;
    }
    public ProdutoCustomizado(int codigoFilamento, String cor, String material, double precoFilamento, String nome,
            ArrayList<Filamento> filamentos, ArrayList<File> arquivos, double preco) {
        super(codigoFilamento, cor, material, precoFilamento);
        this.nome = nome;
        this.filamentos = filamentos;
        this.arquivos = arquivos;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Filamento> getFilamentos() {
        return filamentos;
    }

    public void setFilamentos(ArrayList<Filamento> filamentos) {
        this.filamentos = filamentos;
    }
    
    public ArrayList<File> getArquivos() {
        return arquivos;
    }

    public void setArquivos(ArrayList<File> arquivos) {
        this.arquivos = arquivos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double gerarPreco (ArrayList<Filamento> filamentos,ArrayList<File> arquivos)
    {
        return 0.0;
        //retorna a multiplicação da quantidade de arquivos e o preco de cada filamento;
    }
}