public class Aluno {
    private String Nome;
    private String Matricula;
    private String Curso;
    private int AnoDeIngresso;

    // Construtor com todos os campos incializados
    public Aluno(String nome, String matricula, String curso, int anoDeIngresso) {
        this.Nome = nome;
        this.Matricula = matricula;
        this.Curso = curso;
        this.AnoDeIngresso = anoDeIngresso;
    }

    // Construtor com apenas o campo Nome inicializado
    public Aluno(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return this.Nome;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }
    public String getMatricula() {
        return this.Matricula;
    }
    public void setMatricula(String matricula) {
        this.Matricula = matricula;
    }
    public String getCurso() {
        return this.Curso;
    }
    public void setCurso(String curso) {
        this.Curso = curso;
    }
    public int getAnoDeIngresso() {
        return this.AnoDeIngresso;
    }
    public void setAnoDeIngresso(int anoDeIngresso) {
        this.AnoDeIngresso = anoDeIngresso;
    }

    public void imprimirInfo(){
        System.out.println("\n======= INFORMAÇÕES DO ALUNO =======\n");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Ano de Ingresso: " + this.getAnoDeIngresso());
        System.out.println("====================================");
    }

    public int calcularTempoDeCurso(int anoAtual){
        return anoAtual > this.getAnoDeIngresso() ? anoAtual - this.getAnoDeIngresso() : 0;
    }
}
