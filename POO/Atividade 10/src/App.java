import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            int opcao = 0;
            Scanner scanner = new Scanner(System.in);
            String nome, cpf, matricula;
            List<Aluno> alunos = new ArrayList<Aluno>();
            List<Professor> professores = new ArrayList<Professor>();
            List<Funcionario> funcionarios = new ArrayList<Funcionario>();
            List<Curso> cursos = new ArrayList<Curso>();
            
            do {
                System.out.println("1 - Cadastrar Aluno\n2 - Cadastrar Professor\n3 - Cadastrar Funcionário\n4 - Cadastrar Curso");
                System.out.println("5 - Listar Alunos\n6 - Listar Professores\n7 - Listar Funcionários\n8 - Listar Cursos\n9 - Realizar Matrícula");
                
                System.out.println("Digite a opção desejada:");
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 0:
                        System.out.println("Saindo da aplicação");
                        break;
                    case 1:
                        int idade;
                        
                        System.out.println("Digite o nome do aluno");
                        nome = scanner.next();
                        
                        System.out.println("Digite a idade do aluno");
                        idade = scanner.nextInt();
                        
                        
                        System.out.println("Digite o CPF do aluno");
                        cpf = scanner.next();
                        
                        System.out.println("Digite a matricula do aluno");
                        matricula = scanner.next();
                        
                        Aluno novoAluno = new Aluno(nome, idade, cpf, matricula);

                        alunos.add(novoAluno);

                        break;
                    case 2:
                        float salario;   
                        String disciplina;

                        System.out.println("Digite o nome do professor");
                        nome = scanner.next();
                        
                        System.out.println("Digite a idade do professor");
                        idade = scanner.nextInt();
                        
                        System.out.println("Digite o CPF do professor");
                        cpf = scanner.next();
                        
                        System.out.println("Digite o salário do professor");
                        salario = scanner.nextFloat();

                        System.out.println("Digite a disciplina do professor");
                        disciplina = scanner.next();

                        Professor novoProfessor = new Professor(nome, idade, cpf, salario, disciplina, 0);

                        professores.add(novoProfessor);

                        break;

                    case 3:
                        String cargo, setor;

                        System.out.println("Digite o nome do funcionário");
                        nome = scanner.next();
                        
                        System.out.println("Digite a idade do funcionário");
                        idade = scanner.nextInt();
                        
                        System.out.println("Digite o CPF do funcionário");
                        cpf = scanner.next();
                        
                        System.out.println("Digite o cargo do funcionário");
                        cargo = scanner.next();

                        System.out.println("Digite o setor do funcionário");
                        setor = scanner.next();

                        Funcionario novoFuncionario = new Funcionario(nome, idade, cpf, cargo, setor, "");
                        
                        funcionarios.add(novoFuncionario);
                        break;

                    case 4:
                        int codigo;
                        String professorResponsavel;
                        
                        System.out.println("Digite o código do curso");
                        codigo = scanner.nextInt();

                        System.out.println("Digite o nome do curso");
                        nome = scanner.next();
                        
                        System.out.println("Digite o nome do professor responsável pelo curso");
                        professorResponsavel = scanner.next();
                        
                        Curso novoCurso = new Curso(codigo, nome, professorResponsavel);
                        
                        cursos.add(novoCurso);

                        break;
                    
                    case 5:
                        System.out.println("Exibindo alunos\n");
                        for (Aluno aluno : alunos) {
                            aluno.exibirDados();
                            System.out.println();
                        }
                        break;

                    case 6:
                        System.out.println("Exibindo professores\n");
                        for (Professor professor : professores) {
                            professor.exibirDados();
                            System.out.println();
                        }
                        break;

                    case 7:
                        System.out.println("Exibindo Funcionários\n");
                        for (Funcionario funcionario : funcionarios) {
                            funcionario.exibirDados();
                            System.out.println();
                        }
                        break;
                    case 8:
                        System.out.println("Exibindo cursos\n");
                        for (Curso curso : cursos) {
                            System.out.println("Código: " + curso.getCodigo());
                            System.out.println("Nome do curso: " + curso.getNome());
                            System.out.println("Professor responsável: " + curso.getProfessorResponsavel());
                            System.out.println();
                        }
                        break;
                    case 9:
                        System.out.println("Matrícula\n");
                        Curso cursoDoAluno = new Curso(0, "", "");
                        Aluno novoAlunoMatriculado = new Aluno("", 0, "", "");
                        
                        for (Curso curso : cursos) {
                            System.out.println("Código: " + curso.getCodigo());
                            System.out.println("Nome: " + curso.getNome());
                            System.out.println("Professor responsável: " + curso.getProfessorResponsavel());
                            System.out.println();
                        }
                        System.out.println("Digite o código do curso desejado:");
                        codigo = scanner.nextInt();

                        for (Curso curso : cursos) {
                            if(curso.getCodigo() == codigo){
                                cursoDoAluno = curso;
                            }
                        }
                        
                        System.out.println("Digite a matricula do aluno");
                        matricula = scanner.next();
                        
                        for (Aluno aluno : alunos) {
                            if(aluno.getMatricula().equals(matricula))
                            novoAlunoMatriculado = aluno;
                        }
                    
                        novoAlunoMatriculado.realizarMatricula(novoAlunoMatriculado, cursoDoAluno);
                        System.out.println("Aluno matriculado");

                        break;
                    default:
                        break;
                }
            } while (opcao != 0);

            scanner.close();
        } catch (MatriculaInvalidaException matriculaInvalidaException) {
            System.out.println(matriculaInvalidaException.getMessage());
        }
    }
}
