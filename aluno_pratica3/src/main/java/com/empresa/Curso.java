package com.empresa;

public class Curso {
    String nome;
    double mensalidade;

    //criando o construtor
    public Curso(String nome, double mensalidade) {
        super();
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    void info() {
        System.out.println("Nome do curso: " + nome);
        System.out.println("Mensalidade: " + mensalidade);
    }
}
