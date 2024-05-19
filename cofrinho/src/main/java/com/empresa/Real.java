package com.empresa;

public class Real extends Coin {
    public Real(double value) {
        super(value);
    }

    public void info() {
        System.out.println("Real: " + value);
    }

    public double convert(){
        return this.value;
    }

    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }

        Real objectReal = (Real) object;

        if (this.value != objectReal.value ) {
            return false;
        }

        return true;
    }

}
