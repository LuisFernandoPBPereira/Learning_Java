import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int Codigo;
    private String Nome;
    private String ProfessorResponsavel;
    private List<Aluno> ListaDeAlunos;

    
    public Curso(int codigo, String nome, String professorResponsavel) {
        Codigo = codigo;
        Nome = nome;
        ProfessorResponsavel = professorResponsavel;
        ListaDeAlunos = new ArrayList<Aluno>();
    }
    
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getProfessorResponsavel() {
        return ProfessorResponsavel;
    }
    public void setProfessorResponsavel(String professorResponsavel) {
        ProfessorResponsavel = professorResponsavel;
    }

    public void adicionarAluno(Aluno aluno){
        ListaDeAlunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        ListaDeAlunos.remove(aluno);
    }

    public void listaAlunos(){
        for (Aluno aluno : ListaDeAlunos) {
            aluno.exibirDados();
        }
    }
}
