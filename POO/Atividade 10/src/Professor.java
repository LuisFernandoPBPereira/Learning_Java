public class Professor extends Pessoa{
    private float Salario;
    private String Disciplina;
    private int QuantidadeAulaDada;
    
    public Professor(String nome, int idade, String cpf, float salario, String disciplina, int quantidadeAulaDada) {
        super(nome, idade, cpf);
        Salario = salario;
        Disciplina = disciplina;
        QuantidadeAulaDada = quantidadeAulaDada;
    }
    
    public int getQuantidadeAulaDada() {
        return QuantidadeAulaDada;
    }


    public void setQuantidadeAulaDada(int quantidadeAulaDada) {
        QuantidadeAulaDada = quantidadeAulaDada;
    }
    
    public float getSalario() {
        return Salario;
    }


    public void setSalario(float salario) {
        Salario = salario;
    }


    public String getDisciplina() {
        return Disciplina;
    }


    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }


    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salário: " + getSalario());
        System.out.println("Disciplina: " + getDisciplina());        
        System.out.println("Quantidade de aula dada: " + getQuantidadeAulaDada());        
    }

    public void darAula(int aulasDadas){
        QuantidadeAulaDada += aulasDadas;
    }
}
