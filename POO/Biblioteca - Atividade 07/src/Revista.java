public class Revista extends Material {
    private int Edicao;
    private String MesPublicacao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao, String mesPublicacao) {
        super(titulo, autor, anoPublicacao);
        Edicao = edicao;
        MesPublicacao = mesPublicacao;
    }
    
    public int getEdicao() {
        return Edicao;
    }
    public void setEdicao(int edicao) {
        Edicao = edicao;
    }
    public String getMesPublicacao() {
        return MesPublicacao;
    }
    public void setMesPublicacao(String mesPublicacao) {
        MesPublicacao = mesPublicacao;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano de publicação: " + this.getAnoPublicacao());
        System.out.println("Edição: " + getEdicao());
        System.out.println("Mês de publicação: " + getMesPublicacao());
    }
}
