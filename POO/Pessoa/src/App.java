import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String nome = scanner.next();
        int idade = scanner.nextInt();
        double altura = scanner.nextDouble();
        int matricula = scanner.nextInt();
        String curso = scanner.next();

        scanner.close();

        Aluno pessoa = new Aluno(nome, idade, altura, matricula, curso);

        pessoa.exibirInformacoes();

        pessoa.fazerAniversario();

        pessoa.exibirInformacoes();
    }


}
