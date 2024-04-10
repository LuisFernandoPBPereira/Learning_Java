public class Carro {
    private String Marca;
    private String Modelo;
    private int Ano;
    private String Cor;
    private double VelocidadeAtual;
    private String Marcha;
    private double NivelCombustivel;
    private double Consumo;
    
    
    // Iniciamos os valores no construtor
    public Carro(String marca, String modelo, int ano, String cor, String marcha, double nivelCombustivel) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Ano = ano;
        this.Cor = cor;
        this.VelocidadeAtual = 0;
        this.Marcha = "N";
        this.NivelCombustivel = nivelCombustivel;
        this.Consumo = 0;
    }
    
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
    
    
    public int getAno() {
        return this.Ano;
    }
    
    
    public void setAno(int ano) {
        this.Ano = ano;
    }
    
    
    public String getCor() {
        return this.Cor;
    }
    
    
    public void setCor(String cor) {
        this.Cor = cor;
    }
    
    
    public double getVelocidadeAtual() {
        return this.VelocidadeAtual;
    }
    
    
    public void setVelocidadeAtual(double velocidadeAtual) {
        this.VelocidadeAtual = velocidadeAtual;
    }
    
    
    public String getMarcha() {
        return this.Marcha;
    }
    
    // No Setter setMarcha, verificamos se a string "marcha" não se iguala às strings passadas na condição
    public void setMarcha(String marcha) {
        if(!(marcha.equals("N") || marcha.equals("1") ||
        marcha.equals("2") || marcha.equals("3") ||
        marcha.equals("4") || marcha.equals("5") ||
        marcha.equals("R"))) 
        {
            //Caso nenhuma se iguale, a marcha permanecerá em neutro
            marcha = "N";
        }
        this.Marcha = marcha;
    }
    
    
    public double getNivelCombustivel() {
        return this.NivelCombustivel;
    }
    
    
    public void setNivelCombustivel(double nivelCombustivel) {
        // Se o parâmetro "niveCombustivel" for negativo, zeramos o parâmetro
        if(nivelCombustivel < 0) nivelCombustivel = 0;
        
        this.NivelCombustivel = nivelCombustivel;
    }
    
    public double getConsumo() {
        return this.Consumo;
    }

    public void acelerar(double velocidade){
        // Se o parâmetro "velocidade" for negativo, zeramos o parâmetro
        if(velocidade < 0) velocidade = 0;
        
        // Senão, adicionamos mais velocidade
        else this.VelocidadeAtual += velocidade; 
    }

    public void frear(double velocidade){
        // Se a velocidade for negativa, transformamos ela em seu valor absoluto
        if(velocidade < 0) Math.abs(velocidade);

        //E subtraímos seu valor
        this.VelocidadeAtual -= velocidade;
    }

    public void abastecer(double combustivel){
        this.NivelCombustivel += combustivel;
    }

    public void consumo(double combustivel, int horas){
        /* 
            O consumo é calculado com a quantidade de combustível gasto,
            dividido pelo tempo em horas (pois não temos a distância percorrida
            e nem a taxa de consumo do veículo)
        */
        this.Consumo = combustivel/horas;
    }
    
    public void exibirInformacoes(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Velocidade atual: " + this.getVelocidadeAtual());
        System.out.println("Marcha atual: " + this.getMarcha());
        System.out.println("Nível do combustível: " + this.getNivelCombustivel());
        System.out.println("O consumo atual é de: " + this.getConsumo() + "L/h");
        System.out.println();
    }
    
}
