package projetofinal;

import java.io.File;

class Modelo extends Filamento
{
    private String nome;
    private int qtdeFilamento;
    private Filamento filamentos;
    private File modelo;

    //ERRO NO VETOR DE FILAMENTOS

    Modelo()
    {
        if(nome != null)
        {
            if(filamentos != null)
            {
                if(modelo != null)
                {
                    Modelo novoModelo = new Modelo();
                }
            }
        }
    }
    Modelo(String nome, Filamento filamentos, File modelo)
    {
        this.nome = nome;
        this.filamentos = filamentos;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtdeFilamento() {
        return qtdeFilamento;
    }
    public void setQtdeFilamento(int qtdeFilamento) {
        this.qtdeFilamento = qtdeFilamento;
    }
    public Filamento getFilamentos() {
        return filamentos;
    }
    public void setFilamentos(Filamento filamentos) {
        this.filamentos = filamentos;
    }
    public File getModelo() {
        return modelo;
    }
    public void setModelo(File modelo) {
        this.modelo = modelo;
    }

}