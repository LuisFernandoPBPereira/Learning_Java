import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario();
        Scanner scanner = new Scanner(System.in);
        int opcao, contID=0;
        String titulo, autor;

        do
        {
            System.out.println("0 - Sair\n1 - Inserir Livro\n2 - Remover Livro\n3 - Exibir livros disponíveis\n4 - Inserir usuário\n5 - Emprestar livro\n6 - Devolver livro\n7 - Listar livros usuário");
            
            System.out.println("Digite uma opção:");
            opcao = scanner.nextInt();
            
            switch (opcao) 
            {
                case 0:
                    System.out.println("Você saiu...");
                    break;
                
                case 1:
                    System.out.println("\nINSERIR LIVRO\n");
                    
                    System.out.println("Digite o título do livro");
                    titulo = scanner.next();

                    System.out.println("Digite o autor");
                    autor = scanner.next();
                    
                    System.out.println("Digite o ano de publicação");
                    int anoPublicacao = scanner.nextInt();

                    Livro novoLivro = new Livro(titulo, autor, anoPublicacao);
                    biblioteca.adicionarLivro(novoLivro);
                    break;

                case 2:
                    System.out.println("\nREMOVER LIVRO\n");
                    biblioteca.removerLivro();
                    
                    break;

                case 3:
                    System.out.println();
                    biblioteca.exibirLivrosDisponiveis();
                    break;

                case 4:
                    contID++;
                    int id = contID;
                    
                    System.out.println("Digite o nome do usuário");
                    String nome = scanner.next();

                    usuario = new Usuario(id, nome);
                    System.out.println("Usuário cadastrado");
                    
                    break;

                case 5:
                    System.out.println("\nEMPRESTAR LIVRO\n");
                    
                    System.out.println("Digite o ID do Livro");
                    int idLivro = scanner.nextInt();

                    Livro livro = biblioteca.getLivro(idLivro);

                    usuario.emprestarLivro(livro);

                    break;

                case 6:
                    System.out.println("\nDEVOLVER LIVRO\n");
                    usuario.devolverLivro();
                    
                break;
                
                    case 7:
                    System.out.println("\nLISTAR LIVROS USUÁRIO\n");
                    usuario.exibirMeusLivros();

                    break;
                
                default:
                    break;
            }
        }while(opcao != 0);
        scanner.close();
    }
}