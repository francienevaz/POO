package com.biblioteca;

public class LivroDigital extends Livro{
    private int download;
    private double tamanho;

    public LivroDigital(String titulo, Autor autor, String genero, int edicao){
        super(titulo, autor, genero, edicao);
    }

     // Getters e setters para tiragem e peso
     public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
