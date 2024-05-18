package com.empresa;

public class Dollar extends Coin {
    public Dollar(double value) {
        super(value);
    }

    public void info() {
        System.out.println("Dollar: " + value);
    }

}