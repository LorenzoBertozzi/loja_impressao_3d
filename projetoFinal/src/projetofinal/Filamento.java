package projetofinal;

class Filamento
{
    protected int codigoFilamento = 0;
    private String cor;
    private String material;
    private double precoFilamento;

    public Filamento criarFilamento()
    {
        codigoFilamento++;
        //recebe todos valores.........
        Filamento novoFilamento = new Filamento();
        return novoFilamento;
    } 

    public Filamento()
    {
       //.............
    }
    
    public Filamento(int codigoFilamento, String cor, String material, double precoFilamento) {
        this.codigoFilamento = codigoFilamento;
        this.cor = cor;
        this.material = material;
        this.precoFilamento = precoFilamento;
    }

    public int getCodigoFilamento() {
        return codigoFilamento;
    }

    public void setCodigoFilamento(int codigoFilamento) {
        this.codigoFilamento = codigoFilamento;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getPreco() {
        return precoFilamento;
    }
    public void setPreco(double precoFilamento) {
        this.precoFilamento = precoFilamento;
    }
    
}