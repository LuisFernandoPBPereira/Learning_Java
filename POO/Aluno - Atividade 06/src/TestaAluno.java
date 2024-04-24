import java.time.LocalDateTime;

public class TestaAluno {
    public void testandoAlunos(){
        Aluno aluno1 = new Aluno("Luis", "000000", "CC", 2022);
        Aluno aluno2 = new Aluno("Fernando");

        aluno1.setNome("Luis F.");
        aluno1.setMatricula("000001");
        aluno1.setCurso("Ciência da Computação");
        aluno1.setAnoDeIngresso(2023);

        aluno2.setNome("Pedro");
        aluno2.setMatricula("000002");
        aluno2.setCurso("Ciência da Computação");
        aluno2.setAnoDeIngresso(2022);

        int tempoDeCurso = aluno1.calcularTempoDeCurso(LocalDateTime.now().getYear());
        
        aluno1.imprimirInfo();
        System.out.println("O aluno: " + aluno1.getNome() + " possui " + tempoDeCurso + " ano(s) de curso");

        tempoDeCurso = aluno2.calcularTempoDeCurso(LocalDateTime.now().getYear());
        
        aluno2.imprimirInfo();
        System.out.println("O aluno: " + aluno2.getNome() + " possui " + tempoDeCurso + " ano(s) de curso");

    }    

}
