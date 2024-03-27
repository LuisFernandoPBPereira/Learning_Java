public class Carro 
{
    private String Marca;
    private String Modelo;
    private String Ano;
    private String Cor;

    public String getMarca() {
        return this.Marca;
    }
    public void setMarca(String marca) {
        this.Marca = marca;
    }
    public String getModelo() {
        return this.Modelo;
    }
    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }
    public String getAno() {
        return this.Ano;
    }
    public void setAno(String ano) {
        this.Ano = ano;
    }
    public String getCor() {
        return this.Cor;
    }
    public void setCor(String cor) {
        this.Cor = cor;
    }
    
    public void ExibirInformacoes()
    {
        System.out.println(this.getMarca());
        System.out.println(this.getModelo());
        System.out.println(this.getAno());
        System.out.println(this.getCor());
    }
}
