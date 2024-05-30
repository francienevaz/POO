package com.banco;

public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        cofrinho.adicionar(new Moeda("Euro", 0.5));
        cofrinho.adicionar(new Moeda("Euro", 0.10));
        cofrinho.adicionar(new Moeda("Euro", 0.05));
        cofrinho.calcularTotal();

        System.out.println("Total do cofrinho: " + cofrinho.calcularTotal());
    }
}