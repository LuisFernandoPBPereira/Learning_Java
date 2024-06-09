import java.util.ArrayList;

public class Usuario 
{
    private int Id;    
    private String Nome;
    private ArrayList<Livro> LivrosEmprestados = new ArrayList<Livro>();

    public Usuario() {}
    
    public Usuario(int id, String nome) {
        this.Id = id;
        this.Nome = nome;
    }
    public int getId() {
        return this.Id;
    }
    public void setId(int id) {
        this.Id = id;
    }
    public String getNome() {
        return this.Nome;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }
    public ArrayList<Livro> getLivrosEmprestados() {
        return this.LivrosEmprestados;
    }
    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.LivrosEmprestados = livrosEmprestados;
    }

    public void emprestarLivro(Livro livro)
    {
        Livro novoLivro = new Livro(livro.getTitulo(), livro.getAutor(), livro.getAnoPublicacao());
        this.LivrosEmprestados.add(novoLivro);
    }

    public void devolverLivro()
    {
        if(this.LivrosEmprestados.size() == 0)
        {
            System.out.println("Não há livros para devolver...");
            return;
        }
        
        this.LivrosEmprestados.removeFirst();
    }

    public void exibirMeusLivros()
    {
        if(LivrosEmprestados.size() == 0)
        {
            System.out.println("Não há livros emprestados...");
            return;
        }

        for (var livro : LivrosEmprestados) 
        {
            System.out.println();
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
            System.out.println();
        }
    }
}
