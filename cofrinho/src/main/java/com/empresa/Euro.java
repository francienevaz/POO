package com.empresa;

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    public void info() {
        System.out.println("Euro: " + valor);
    }

    public double converter() {
        return this.valor * 5.55;
    }
    
    /**
     * Verifica se dois objetos Euro são iguais em valor.
     *
     * @param objeto O objeto a ser comparado.
     * @return `true` se os objetos forem iguais, ou `false` caso contrário.
     */

    @Override
    public boolean equals(Object objeto) {
        if (this.getClass()!= objeto.getClass()) {
            return false;
        }

        Euro objetoEuro = (Euro) objeto;

        if (this.valor!= objetoEuro.valor ) {
            return false;
        }
        
        return true;
    }
}