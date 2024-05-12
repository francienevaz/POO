package com.empresa;

public class Dollar extends Coin {
    public Dollar(double value) {
        super(value);
    }

    // Implementação específica de conversão para dólar
    public double convertToDollar(Coin otherCoin) {
        return otherCoin.getValue() / this.getValue();
    }
}