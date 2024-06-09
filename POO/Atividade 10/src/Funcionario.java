public class Funcionario extends Pessoa{
    private String Cargo;
    private String Setor;
    private String TarefaExecutada;
    
    
    public Funcionario(String nome, int idade, String cpf, String cargo, String setor, String tarefaExecutada) {
        super(nome, idade, cpf);
        Cargo = cargo;
        Setor = setor;
        TarefaExecutada = tarefaExecutada;
    }
    
    public String getTarefaExecutada() {
        return TarefaExecutada;
    }

    public void setTarefaExecutada(String tarefaExecutada) {
        TarefaExecutada = tarefaExecutada;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String setor) {
        Setor = setor;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Setor: " + getSetor());
    }
    
    public void executarTarefa(String tarefa){
        TarefaExecutada = tarefa;
        System.out.println("Executando :" + tarefa);
    }
}
