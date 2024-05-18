package com.empresa;

public class Real extends Coin {
    public Real(double value) {
        super(value);
    }

    public void info() {
        System.out.println("Real: " + value);
    }

    // public double convertToReal(Coin otherCoin) {
    //     return otherCoin.getValue() / this.getValue();
    // }

}
