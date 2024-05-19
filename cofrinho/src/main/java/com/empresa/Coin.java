package com.empresa;

public abstract class Coin {
    protected double value;

    public Coin(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void info() {
        System.out.println("Valor da moeda: " + value);
    }

    public double convertTo(Coin otherCoin) {
        return this.value / otherCoin.value;
    }

    public abstract double convert();
}
