import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        List<ProdutoEletronico> produtos = new ArrayList<ProdutoEletronico>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do
        {
            System.out.println("");
            System.out.println("Digite uma opção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Você saiu...");
                    break;
                
                case 1:
                    System.out.println("INSERIR PRODUTO");

                    System.out.println("Digite o nome do produto");
                    String nome = scanner.next();
                    System.out.println("Digite a marca do produto");
                    String marca = scanner.next();
                    System.out.println("Digite preço do produto");
                    double preco = scanner.nextDouble();

                    ProdutoEletronico produto = new ProdutoEletronico(nome, marca, preco);

                    produtos.add(produto);
                    break;

                case 2:
                    System.out.println("INSERIR CLIENTE");

                    String nomeCliente = scanner.next();
                    String endereco = scanner.next();
                    String cpf = scanner.next();

                    cliente = new Cliente(nomeCliente, endereco, cpf);
                    break;

                case 3:
                    break;
                default:
                    break;
            }

        }while(opcao != 0);

        scanner.close();


    }
}
