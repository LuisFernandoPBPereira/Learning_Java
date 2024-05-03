public class Livro
{
    private String Titulo;
    private String Autor;
    private int AnoPublicacao;
    private boolean Disponivel;
    
    public Livro(String titulo, String autor, int anoPublicacao) 
    {
        this.Titulo = titulo;
        this.Autor = autor;
        this.AnoPublicacao = anoPublicacao;
        this.Disponivel = true;
    }

    public String getTitulo() 
    {
        return this.Titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.Titulo = titulo;
    }

    public String getAutor() 
    {
        return this.Autor;
    }

    public void setAutor(String autor) 
    {
        this.Autor = autor;
    }

    public int getAnoPublicacao() 
    {
        return this.AnoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao)
    {
        this.AnoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() 
    {
        return this.Disponivel;
    }

    public void setDisponivel(boolean disponivel) 
    {
        this.Disponivel = disponivel;
    }

    public void emprestar()
    {
        this.Disponivel = false;
    }

    public void devolver()
    {
        this.Disponivel = true;
    }
    
}