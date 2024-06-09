public class Livro extends Material{
    private int NumeroPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        super(titulo, autor, anoPublicacao);
        NumeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        NumeroPaginas = numeroPaginas;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano de publicação: " + this.getAnoPublicacao());
        System.out.println("Número de páginas: " + getNumeroPaginas());
    }
}
