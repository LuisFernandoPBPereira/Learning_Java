public class Aluno{
    private String Nome;
    private int Idade;
    private String Ra;
    private String Curso;

    public Aluno(String nome, int idade, String ra, String curso) {
        Nome = nome;
        Idade = idade;
        Ra = ra;
        Curso = curso;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }
    public String getRa() {
        return Ra;
    }
    public void setRa(String ra) {
        Ra = ra;
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
        System.out.println("RA: " + this.getRa());
        System.out.println("Curso: " + this.getCurso());
    }

    public void alterarCurso(String novoCurso){
        if(novoCurso.length() == 0){
            System.out.println("Digite algo para atualizar o curso.");
        }
        else{
            setCurso(novoCurso);
        }
    }

    public boolean menorIdade(){
        if(getIdade() < 18)
            return true;
        else
            return false;
    }


}