package com.empresa;

public class Dollar extends Coin {
    public Dollar(double value) {
        super(value);
    }

    public void info() {
        System.out.println("Dollar: " + value);
    }

    // Implementação específica de conversão para dólar
    public double convertToDollar(Coin otherCoin) {
        return otherCoin.getValue() / this.getValue();
    }
}