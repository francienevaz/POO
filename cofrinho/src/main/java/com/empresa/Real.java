package com.empresa;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    public void info() {
        System.out.println("Real: " + valor);
    }

    public double converter(){
        return this.valor;
    }
    
    /**
     * Verifica se dois objetos Real são iguais em valor.
     *
     * @param objeto O objeto a ser comparado.
     * @return `true` se os objetos forem iguais, ou `false` caso contrário.
     */

    @Override
    public boolean equals(Object objeto) {
        if (this.getClass()!= objeto.getClass()) {
            return false;
        }

        Real objetoReal = (Real) objeto;

        if (this.valor!= objetoReal.valor ) {
            return false;
        }
        return true;
    }
}
