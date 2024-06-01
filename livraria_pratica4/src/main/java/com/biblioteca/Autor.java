package com.biblioteca;

public class Autor {
    private String nome;
    private String email;
    private String nacionalidade;

    public Autor(String nome, String email, String nacionalidade) {
        super();
        this.nome = nome;
        this.email = email;
        this.nacionalidade = nacionalidade;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para email
    public String getEmail() {
        return email;
    }

    // Setter para email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter para nacionalidade
    public String getNacionalidade() {
        return nacionalidade;
    }

    // Setter para nacionalidade
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}

