package com.empresa;

public class Dollar extends Coin {
    public Dollar(double value) {
        super(value);
    }

    public void info() {
        System.out.println("Dollar: " + value);
    }

    public double convert() {
        return this.value * 5.1;
    }

    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }

        Dollar objectDollar = (Dollar) object;

        if (this.value != objectDollar.value ) {
            return false;
        }
        
        return true;
    }

}