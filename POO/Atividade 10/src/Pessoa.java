public abstract class Pessoa{
    private String Nome;
    private int Idade;
    private String Cpf;

    public Pessoa(String nome, int idade, String cpf) {
        Nome = nome;
        Idade = idade;
        Cpf = cpf;
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

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public abstract void exibirDados();
}