package com.empresa;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    public void info() {
        System.out.println("Dólar: " + valor);
    }

    public double converter() {
        return this.valor * 5.1;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this.getClass()!= objeto.getClass()) {
            return false;
        }

        Dolar objetoDolar = (Dolar) objeto;

        if (this.valor!= objetoDolar.valor ) {
            return false;
        }
        
        return true;
    }
}