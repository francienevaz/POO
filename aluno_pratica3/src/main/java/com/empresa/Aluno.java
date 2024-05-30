package com.empresa;

public class Aluno {
    String nome;
    int matricula;
    double desconto;
    Curso curso;

    public Aluno(String nome, int matricula, double desconto, Curso curso) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.desconto = desconto;
        this.curso = curso;
    }

    void info() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Desconto: " + desconto);
        curso.info();
    }

    double pagamento(){
        return curso.mensalidade * (1 - desconto);
    }
}
