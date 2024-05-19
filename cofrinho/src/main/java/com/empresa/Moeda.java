package com.empresa;

public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void info() {
        System.out.println("Valor da moeda: " + valor);
    }

    public abstract double converter();
}