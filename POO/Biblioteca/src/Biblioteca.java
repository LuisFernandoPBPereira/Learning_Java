import java.util.ArrayList;

public class Biblioteca 
{
    private ArrayList<Livro> livrosDisponiveis = new ArrayList<Livro>();

    public Livro getLivro(int id)
    {
        if(this.livrosDisponiveis.size() == 0)
        {
            System.out.println("Não há livros na biblioteca...");
            return null;
        }

        return this.livrosDisponiveis.get(id);
    }

    public void adicionarLivro(Livro livro)
    {
        Livro novoLivro = new Livro(livro.getTitulo(), livro.getAutor(), livro.getAnoPublicacao());
        livrosDisponiveis.add(novoLivro);
    }

    public void removerLivro()
    {
        if(this.livrosDisponiveis.size() == 0)
        {
            System.out.println("Não há livros na biblioteca para remover...");
            return;
        }

        livrosDisponiveis.removeFirst();
    }

    public void exibirLivrosDisponiveis()
    {
        if(this.livrosDisponiveis.size() == 0)
        {
            System.out.println("Não há livros na biblioteca...");
            return;
        }

        System.out.println("============ LIVROS ============");

        for (var livro : livrosDisponiveis) {
            System.out.println();
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
            System.out.println(livro.isDisponivel() == true ? "Disponível" : "Emprestado");
            System.out.println();
        }

        System.out.println("==============================");
    }
}
