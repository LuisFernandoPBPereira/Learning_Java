import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String Matricula;
    private List<Curso> ListaDeCursos;
    
    public Aluno(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf);
        Matricula = matricula;
        ListaDeCursos = new ArrayList<Curso>();
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matrícula: " + getMatricula());
    }
    
    public void realizarMatricula(Aluno aluno, Curso curso) throws MatriculaInvalidaException{
        if(ListaDeCursos.size() == 5){
            throw new MatriculaInvalidaException("Não é possível se matricular em mais de 5 cursos");
        }
        else{
            curso.adicionarAluno(aluno);
            ListaDeCursos.add(curso);
            System.out.println("Curso adicionado com sucesso");
        }
    }
}
