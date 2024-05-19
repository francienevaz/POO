package com.empresa;

import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> moedas; 
    private double valor;

    public Cofrinho() {
        this.moedas = new ArrayList<Moeda>();
        this.valor = 0.0;
    }     

    public void addMoeda(Moeda moeda) {
        moedas.add(moeda);
        this.valor += moeda.getValor();
        System.out.println("Moeda adicionada: " + moeda.getValor());
    }

    public boolean removerMoeda(Moeda moeda) {
        return this.moedas.remove(moeda);
    }

    public void listMoedas() {   
        if (this.moedas.isEmpty()) {
            System.out.println("Não há moedas no cofrinho.");
            return;
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : moedas) {
                moeda.info();
                System.out.println(moeda.getValor());
            }
        }        
    }

    public double totalConvertido() {
        if (this.moedas.isEmpty()){
            return 0.0;
        }
        double total = 0.0;

        for (Moeda moeda : moedas) {
            total += moeda.converter();
            }

        return total;
    }
}