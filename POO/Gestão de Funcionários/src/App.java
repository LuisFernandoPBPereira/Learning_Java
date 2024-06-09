import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do
        {
            System.out.println("0 - Sair\n1 - Contratar funcionário horista\n2 - Contratar funcionário mensalista\n3 - Calcular folha de pagamento");
            System.out.println("Digite uma opção");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Você saiu...");
                    break;
            
                case 1:
                    System.out.println("\nCONTRATAR FUNCIONÁRIO HORISTA\n");
                    empresa.contratarFuncionarioHorista();

                    break;

                case 2:
                    System.out.println("\nCONTRATAR FUNCIONÁRIO MENSALISTA\n");
                    empresa.contratarFuncionarioMensalista();

                    break;

                case 3:
                    System.out.println("\nCALCULAR FOLHA DE PAGAMENTO\n");
                    System.out.println("O total a ser pago é a quantia de R$" + empresa.calcularFolhaDePagamento());
                    break;
                default:
                    break;
            }

        }while(opcao != 0);
        scanner.close();
    }
}
