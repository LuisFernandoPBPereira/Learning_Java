public class Carro {
    private String Marca;
    private String Modelo;
    private int Ano;
    private String Cor;
    private double VelocidadeAtual;
    private int Marcha;
    private double NivelCombustivel;
    
    
    public Carro(String marca, String modelo, int ano, String cor, int marcha, double nivelCombustivel) {
        Marca = marca;
        Modelo = modelo;
        Ano = ano;
        Cor = cor;
        VelocidadeAtual = 0;
        Marcha = marcha;
        NivelCombustivel = nivelCombustivel;
    }

    public String getMarca() {
        return Marca;
    }


    public void setMarca(String marca) {
        Marca = marca;
    }


    public String getModelo() {
        return Modelo;
    }


    public void setModelo(String modelo) {
        Modelo = modelo;
    }


    public int getAno() {
        return Ano;
    }


    public void setAno(int ano) {
        Ano = ano;
    }


    public String getCor() {
        return Cor;
    }


    public void setCor(String cor) {
        Cor = cor;
    }


    public double getVelocidadeAtual() {
        return VelocidadeAtual;
    }


    public void setVelocidadeAtual(double velocidadeAtual) {
        VelocidadeAtual = velocidadeAtual;
    }


    public int getMarcha() {
        return Marcha;
    }


    public void setMarcha(int marcha) {
        Marcha = marcha;
    }


    public double getNivelCombustivel() {
        return NivelCombustivel;
    }


    public void setNivelCombustivel(double nivelCombustivel) {
        NivelCombustivel = nivelCombustivel;
    }

    public void acelerar(double velocidade){
        if(this.VelocidadeAtual < velocidade){
            this.VelocidadeAtual = 0;
        }
        else{
            this.VelocidadeAtual += velocidade; 
        }
    }

    public void frear(double velocidade){
        this.VelocidadeAtual -= velocidade;
    }

    public void abastecer(double combustivel){
        this.NivelCombustivel += combustivel;
    }

    public void consumo(double combustivel, int horas){
        double consumoFinal = combustivel/horas;
        System.out.println("O consumo atual é de: " + consumoFinal + "L/h");
    }

    public void exibirInformacoes(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Velocidade atual: " + this.getVelocidadeAtual());
        System.out.println("Marcha atual: " + this.getMarcha());
        System.out.println("Nível do combustível: " + this.getNivelCombustivel());
    }
    
}
