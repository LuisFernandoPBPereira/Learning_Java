public class ProdutoEletronico
{
    private String Nome;
    private String Marca;
    private double Preco;
    
    public ProdutoEletronico(String nome, String marca, double preco) {
        Nome = nome;
        Marca = marca;
        Preco = preco;
    }


    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public double getPreco() {
        return Preco;
    }
    public void setPreco(double preco) {
        Preco = preco;
    }
}