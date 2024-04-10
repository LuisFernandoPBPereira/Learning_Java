public class App {
    public static void main(String[] args) throws Exception {
        // Iniciamos a instância do objeto, já com os valores iniciados.
        Carro carro = new Carro("Honda", "Civic", 1999, "Preto", "1", 54);
        
        //Chamamos os atributos do objeto, e a cada alteração, exibimos as informações
        carro.setMarcha("1");
        carro.acelerar(50);
        carro.exibirInformacoes();

        carro.consumo(5, 1);
        carro.exibirInformacoes();

        carro.frear(20);
        carro.exibirInformacoes();
    }
}
