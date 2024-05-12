package com.empresa;

public class Euro extends Coin {
    public Euro(double value) {
        super(value);
    }

    // Implementação específica de conversão para euro
    public double convertToEuro(Coin otherCoin) {
        return otherCoin.getValue() / this.getValue();
    }
}

