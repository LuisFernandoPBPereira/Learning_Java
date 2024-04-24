import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // ==================== Teste da Classe Aluno =============================
        // TestaAluno teste = new TestaAluno();
        // teste.testandoAlunos();
        // ========================================================================

        int cont=0;
        String opcao;
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[6];

        do{
            System.out.println("0 - Sair\n1 - Inserir Aluno(a)\n2 - Aluno(a) veterano(a)\n3 - Exibir Alunos");
            System.out.println("Digite uma opção:");
            opcao = scanner.next();

            switch (opcao) {
                case "0":
                    System.out.println("Você saiu...");
                    break;
                
                case "1":
                    if(cont == alunos.length){
                        System.out.println("Capacidade máxima atingida");
                    }
                    else{
                        System.out.println("\nInserir aluno(a):\n");
    
                        String nome, matricula, curso;
                        int anoDeIngresso;
    
                        System.out.println("Digite o nome do(a) aluno(a):");
                        nome = scanner.next();
                        
                        System.out.println("Digite a matrícula do(a) aluno(a):");
                        matricula = scanner.next();
                        
                        System.out.println("Digite o curso do(a) aluno(a):");
                        curso = scanner.next();
                        
                        System.out.println("Digite o ano de ingresso ao curso do(a) aluno(a):");
                        anoDeIngresso = scanner.nextInt();
    
                        Aluno novoAluno = new Aluno(nome, matricula, curso, anoDeIngresso);
    
                        alunos[cont] = novoAluno;
    
                        cont++;
                    }
                    break;

                case "2":
                    if(alunos[0] == null){
                        System.out.println("\nNão há nenhum aluno na base de dados...\n");
                    }
                    else{
                        int menor = alunos[0].getAnoDeIngresso();
                        Aluno veterano = alunos[0];
    
                        for(int i=0; i < cont; i++){
                            if(alunos[i].getAnoDeIngresso() < menor){
                                menor = alunos[i].getAnoDeIngresso();
                                veterano = alunos[i];
                            }
                        }
    
                        System.out.println();
                        System.out.println(veterano.getNome() + " é o(a) aluno(a) veterano(a).\n");
                    }
                    break;

                case "3":
                    if(alunos[0] == null){
                        System.out.println("\nNão há alunos na base de dados...\n");
                    }
                    else{
                        System.out.println("\nExibindo alunos:\n");
    
                        for(int i=0; i < cont; i++)
                            alunos[i].imprimirInfo();
                    }
                    break;

                default:
                    System.out.println("\nOpção inválida, tente novamente.\n");
                    break;
            }
        } while(!opcao.equals("0"));

        scanner.close();
    }
}
