package projetofinal;

import java.io.File;
import java.util.ArrayList;

class Produto extends Modelo
{
    protected int codigo = 0;
    private String nomeProduto;
    private double precoProduto;

    public Produto criarProduto()
    {
        codigo++;
        //..recebe todos valores de Produto
        Produto novoProduto = new Produto();
        return novoProduto;
    }

    Produto()
    {
        //.....
    }

    public Produto(int codigo, String nomeProduto, double precoProduto) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public Produto(int codigoModelo, String nomeModelo, int quantidadePecas, ArrayList<Filamento> filamentos,File modelo, int codigo, String nomeProduto, double precoProduto) {
        super(codigoModelo, nomeModelo, quantidadePecas, filamentos, modelo);
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public Produto(String cor, String material, double precoFilamento, int codigoModelo, String nomeModelo,
            int quantidadePecas, ArrayList<Filamento> filamentos, File modelo, int codigo, String nomeProduto,
            double precoProduto) {
        super(cor, material, precoFilamento, codigoModelo, nomeModelo, quantidadePecas, filamentos, modelo);
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

}