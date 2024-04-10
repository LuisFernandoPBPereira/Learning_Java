public class Livro 
{
    private String Titulo;
    
    private String Autor;    
    private int AnoPublicacao;    
    private boolean Emprestado;
    
    public Livro(String titulo, String autor, int anoPublicacao) {
        Titulo = titulo;
        Autor = autor;
        AnoPublicacao = anoPublicacao;
        Emprestado = false;
    }

    public String getTitulo() {
        return this.Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAutor() {
        return this.Autor;
    }
    public void setAutor(String autor) {
        this.Autor = autor;
    }
    public int getAnoPublicacao() {
        return this.AnoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.AnoPublicacao = anoPublicacao;
    }

    public void emprestar(){
        this.Emprestado = true;
    }

    public void devolver(){
        this.Emprestado = false;
    }

    public void exibirInformacoes(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano da Publicação: " + this.getAnoPublicacao());
        System.out.println("Livro emprestado: " + this.Emprestado);
        System.out.println();    
    }

}
