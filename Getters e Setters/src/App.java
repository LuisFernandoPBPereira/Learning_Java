public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.setMarca("Honda");
        carro.setModelo("Civic");
        carro.setAno("1999");
        carro.setCor("Preto");

        carro.ExibirInformacoes();
    }
}
