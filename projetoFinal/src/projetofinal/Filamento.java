package projetofinal;

class Filamento
{
    private String cor;
    private String material;
    private double preco;

    public Filamento()
    {
        if(cor != null)
        {
            if(material != null)
            {
                if(preco != 0.0)
                {
                    Filamento novoFilamento = new Filamento();
                }
            }
        }
    }
    
    Filamento(String cor, String material, double preco)
    {
        this.cor = cor;
        this.material = material;
        this.preco = preco;
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
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}