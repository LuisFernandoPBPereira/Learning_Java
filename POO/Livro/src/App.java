public class App {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("Harry Potter", "J. K. Rolling", 2000);

        livro.exibirInformacoes();
        livro.emprestar();
        livro.exibirInformacoes();
        livro.devolver();
        livro.exibirInformacoes();
    }
}

