public abstract class Material {
    private String Titulo;
    private String Autor;
    private int AnoPublicacao;

    public Material(String titulo, String autor, int anoPublicacao) {
        Titulo = titulo;
        Autor = autor;
        AnoPublicacao = anoPublicacao;
    }
    
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public int getAnoPublicacao() {
        return AnoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        AnoPublicacao = anoPublicacao;
    }
    
    public abstract void exibirDetalhes();

}
