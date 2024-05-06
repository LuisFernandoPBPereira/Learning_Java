public class Cliente 
{
    private String Nome;
    private String Endereco;
    private String Cpf;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String endereco, String cpf) {
        Nome = nome;
        Endereco = endereco;
        Cpf = cpf;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }    
}
