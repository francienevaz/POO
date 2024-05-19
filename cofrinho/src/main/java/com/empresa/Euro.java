package com.empresa;

public class Euro extends Coin {
    public Euro(double value) {
        super(value);
    }

    public void info() {
        System.out.println("Euro: " + value);
    }

    public double convert() {
        return this.value * 5.55;
    }

    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }

        Euro objectEuro = (Euro) object;

        if (this.value != objectEuro.value ) {
            return false;
        }
        
        return true;
    }
}

