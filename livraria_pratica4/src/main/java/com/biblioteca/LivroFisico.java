package com.biblioteca;

public class LivroFisico extends Livro {
    private int tiragem;
    private int peso;

    // Construtor da subclasse deve chamar o construtor da superclasse corretamente
    public LivroFisico(String titulo, Autor autor, String genero, int edicao) {
        super(titulo, autor, genero, edicao);
    }

    // Getters e setters para tiragem e peso
    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

