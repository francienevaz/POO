package com.banco;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
        System.out.println("Adicionando moeda: " + moeda.getValor());
    }

    public double calcularTotal(){
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.getValor();
            }
            return total;
    }
        
}
