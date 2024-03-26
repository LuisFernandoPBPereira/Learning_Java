import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> usuarios = new ArrayList<Pessoa>();

        int quantidade=0;
        String nome="";
        int idade = 0;


        System.out.println("Quantos usuarios deseja inserir?");
        quantidade = sc.nextInt();

        for(int i=0; i<quantidade; i++) 
        {
            Pessoa pessoa = new Pessoa();

            System.out.println("Digite um nome");
            nome = sc.next();

            System.out.println("Digite a idade");
            idade = sc.nextInt();

            pessoa.Nome = nome;
            pessoa.Idade = idade;

            usuarios.add(pessoa);
        }

        sc.close();
        
        for(var usuario : usuarios) 
        {
            System.out.println(usuario.Nome);
            System.out.println(usuario.Idade);
        }
    }
}
