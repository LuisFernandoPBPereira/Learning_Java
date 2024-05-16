public class Biblioteca {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("As Crônicas De Nárnia", "Autor do livro", 2000, 600);
        Revista revista = new Revista("Ciência Hoje", "Autor do livro", 2002, 10, "dezembro");
    
        livro.exibirDetalhes();
        System.out.println();
        revista.exibirDetalhes();
    }
}
 