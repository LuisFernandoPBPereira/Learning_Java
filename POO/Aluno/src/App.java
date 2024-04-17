import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Luis", 17, "000000", "Ciência da Computação");
        int opcao=0, cont=0;
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];

        do{
            System.out.println("0 - Sair\n1 - Alterar Curso\n2 - Aluno é menor de idade?\n3 - Exibir Informações\n4 - Inserir Aluno\n5 - Exibir Alunos\n6 - Nome do aluno com menor idade\n");
            System.out.println("Digite uma opção:");
            opcao = scanner.nextInt();
            System.out.println();
            
            switch (opcao) {
                case 0:
                    System.out.println("Você saiu");
                    break;
                case 1:
                    String curso = "";
                    
                    System.out.println("Digite o nome do curso:");
                    curso = scanner.next();
                    
                    aluno.alterarCurso(curso);
                    System.out.println();

                    break;
                case 2:
                    if(aluno.menorIdade()){
                        System.out.println("O aluno é menor de idade\n");
                    }
                    else{
                        System.out.println("O aluno é maior de idade\n");
                    }
                    System.out.println();

                    break;
                case 3:
                    System.out.println("Aluno inserido manualmente no construtor:");
                    aluno.exibirInformacoes();
                    break;
                case 4:
                    if(cont == 10) System.out.println("capacidade máxima atingida");
                    else{
                        String nome, ra, curso2;
                        int idade;
    
                        System.out.println("Digite o nome do aluno:");
                        nome = scanner.next();
    
                        System.out.println("Digite a idade do aluno:");
                        idade = scanner.nextInt();
    
                        System.out.println("Digite o RA do aluno:");
                        ra = scanner.next();
    
                        System.out.println("Digite o curso do aluno:");
                        curso2 = scanner.next();
    
                        Aluno alunoObj = new Aluno(nome, idade, ra, curso2);
                        alunos[cont] = alunoObj;
                        cont++;
                        System.out.println();
                    }

                    break;
                case 5:
                    if(cont == 0 || alunos.length == 0){
                        System.out.println("Não há alunos para serem exibidos\n");
                    }
                    else if(cont == 10) {
                        for(int i=0; i<alunos.length; i++){
                            alunos[i].exibirInformacoes();
                            System.out.println();
                        }    
                    }
                    else{
                        for(int i=0; i<cont; i++){
                            alunos[i].exibirInformacoes();
                            System.out.println();
                        }
                    }
                    break;
                case 6:
                    int menor=alunos[0].getIdade();
                    String nomeMenor=alunos[0].getNome();

                    for(int i=0; i<cont; i++){
                        if(alunos[i].getIdade() < menor){
                            menor = alunos[i].getIdade();
                            nomeMenor = alunos[i].getNome();
                        }
                    }

                    System.out.println("O aluno com menor idade é: " + nomeMenor);
                    System.out.println();
                    break;

                default:
                    break;
            }
        }while(opcao != 0);
        scanner.close();
    }
}
