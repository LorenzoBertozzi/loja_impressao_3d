package projetofinal;

import java.io.File;
import java.util.ArrayList;

class Modelo extends Filamento
{
    protected int codigoModelo = 0;
    private String nomeModelo;
    private int quantidadePecas;
    private ArrayList<Filamento> filamentos;
    private File modelo;

    public Modelo criaModelo()
    {
        codigoModelo++;
        //recebe todos dados de Modelo ....
        Modelo novoModelo = new Modelo();
        return novoModelo;
    }

    Modelo()
    {
        //......confere se todos dados esta inseridos
    }

    public Modelo(int codigoModelo, String nomeModelo, int quantidadePecas, ArrayList<Filamento> filamentos, File modelo) {
        this.codigoModelo = codigoModelo;
        this.nomeModelo = nomeModelo;
        this.quantidadePecas = quantidadePecas;
        this.filamentos = filamentos;
        this.modelo = modelo;
    }

    public Modelo(String cor, String material, double precoFilamento, int codigoModelo, String nomeModelo, int quantidadePecas,ArrayList<Filamento> filamentos, File modelo) {
        super(quantidadePecas, cor, material, precoFilamento);
        this.codigoModelo = codigoModelo;
        this.nomeModelo = nomeModelo;
        this.quantidadePecas = quantidadePecas;
        this.filamentos = filamentos;
        this.modelo = modelo;
    }

    public int getCodigoModelo() {
        return codigoModelo;
    }
    public void setCodigoModelo(int codigoModelo) {
        this.codigoModelo = codigoModelo;
    }
    public String getnomeModelo() {
        return nomeModelo;
    }
    public void setnomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }
    public int getQuantidadePecas() {
        return quantidadePecas;
    }

    public void setQuantidadePecas(int quantidadePecas) {
        this.quantidadePecas = quantidadePecas;
    }
    public ArrayList<Filamento> getFilamentos() {
        return filamentos;
    }
    public void setFilamentos(ArrayList<Filamento> filamentos) {
        this.filamentos = filamentos;
    }
    public File getModelo() {
        return modelo;
    }
    public void setModelo(File modelo) {
        this.modelo = modelo;
    }

}