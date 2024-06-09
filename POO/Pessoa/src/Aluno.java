public class Aluno extends Pessoa{
    private int Matricula;
    private String Curso;
    
    public Aluno(String nome, int idade, double altura, int matricula, String curso) {
        super(nome, idade, altura);
        this.Matricula = matricula;
        this.Curso = curso;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
        System.out.println();
    }
}