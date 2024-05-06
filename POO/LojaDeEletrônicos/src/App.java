import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido();
        List<ProdutoEletronico> produtos = new ArrayList<ProdutoEletronico>();
        
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do
        {
            System.out.println("0 - Sair\n1 - Inserir Produto\n2 - Inserir Cliente\n3 - Adicionar Itens no Pedido\n4 - Listar Pedido\n5 - Calcular Total\n6 - Listar Produtos Disponíveis");
            System.out.println("Digite uma opção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Você saiu...");
                    break;
                
                case 1:
                    System.out.println("\nINSERIR PRODUTO\n");

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
                    System.out.println("\nINSERIR CLIENTE\n");

                    System.out.println("Digite o nome do cliente");
                    String nomeCliente = scanner.next();

                    System.out.println("Digite o endereço do cliente");
                    String endereco = scanner.next();

                    System.out.println("Digite o CPF do cliente");
                    String cpf = scanner.next();

                    cliente = new Cliente(nomeCliente, endereco, cpf);
                    break;

                case 3:
                    System.out.println("\nADICIONAR ITENS NO PEDIDO\n");
                    
                    System.out.println("Digite o ID do produto:");
                    int id = scanner.nextInt();

                    if(pedido.getCliente() == null)
                        pedido.setCliente(cliente);

                    pedido.adicionarItem(produtos.get(id-1));

                    break;

                case 4:
                    System.out.println("\nLISTAR PEDIDO\n");

                    pedido.listarPedido();
                    break;

                case 5:
                    System.out.println("\nCALCULAR TOTAL\n");

                    System.out.println("Preço total: " + pedido.calcularTotal());
                    
                    break;

                case 6:
                    int cont=1;
                    System.out.println("\nLISTAR PRODUTOS DISPONÍVEIS\n");

                    for (var item : produtos)
                    {
                        System.out.println("ID: " + cont);
                        System.out.println("Marca: " + item.getMarca());
                        System.out.println("Nome: " + item.getNome());
                        System.out.println("Preço: " + item.getPreco());
                        cont++;
                    }
                    System.out.println();
                    break;
                default:
                    break;
            }

        }while(opcao != 0);

        scanner.close();


    }
}
