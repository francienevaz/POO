package empresa;

public class Aluno {
    String nome;
    String curso;
    Avaliacao notas;

    //construtor

    public Aluno(String nome, String curso, Avaliacao notas){
        super();
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    }

    void info(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Média A: " + notas.mediaAritimetica());
        System.out.println("Média P: " + notas.mediaPonderada());

    }
}
