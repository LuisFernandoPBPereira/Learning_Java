import java.util.ArrayList;
import java.util.Scanner;

public class Empresa 
{
    private ArrayList<FuncionarioHorista> funcionariosHoristas = new ArrayList<>();
    private ArrayList<FuncionarioMensalista> funcionariosMensalistas = new ArrayList<>();


    public void contratarFuncionarioHorista()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário");
        String nome = scanner.next();
        System.out.println("Digite a idade do funcionário");
        int idade = scanner.nextInt();
        System.out.println("Digite as horas trabalhadas do funcionário");
        int horasTrabalhadas = scanner.nextInt();

        FuncionarioHorista novoFuncionario = new FuncionarioHorista(nome, idade, horasTrabalhadas);

        funcionariosHoristas.add(novoFuncionario);
    }

    public void contratarFuncionarioMensalista()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário");
        String nome = scanner.next();
        System.out.println("Digite a idade do funcionário");
        int idade = scanner.nextInt();

        FuncionarioMensalista novoFuncionario = new FuncionarioMensalista(nome, idade, 1500);

        funcionariosMensalistas.add(novoFuncionario);
    }

    public double calcularFolhaDePagamento()
    {
        double total = 0;
        for (var funcionario : funcionariosHoristas) {
            total += funcionario.calculaSalario();
        }

        for (var funcionario : funcionariosMensalistas) {
            total += funcionario.calculaSalario();
        }

        return total;
    }
}
