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
 
    /**
     * Verifica se dois objetos Dolar são iguais em valor.
     *
     * @param objeto O objeto a ser comparado.
     * @return `true` se os objetos forem iguais, ou `false` caso contrário.
     */
    @Override
    public boolean equals(Object objeto) {
        // Verifica se os objetos são da mesma classe
        if (this.getClass() != objeto.getClass()) {
            return false;
        }

        // Converte o objeto para Dolar
        Dolar objetoDolar = (Dolar) objeto;

        // Compara os valores
        if (this.valor != objetoDolar.valor) {
            return false;
        }

        // Se todos os testes forem bem-sucedidos
        return true;
    }
}