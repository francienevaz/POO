package com.empresa;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Coin> coinsList; 
    private double value;

    public Cofrinho() {
        this.coinsList = new ArrayList<Coin>();
        this.value = 0.0;
    }     

    public void addCoin(Coin coin) {
        coinsList.add(coin);
        this.value += coin.getValue();
        System.out.println("Moeda adicionada: " + coin.getValue());
    }

    public boolean removeCoin(Coin coin) {
        return this.coinsList.remove(coin);
    }

    public void listCoins() {   
        if (this.coinsList.isEmpty()) {
            System.out.println("Não há moedas no cofrinho.");
            return;
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Coin coin : coinsList) {
                coin.info();
                System.out.println(coin.getValue());
            }
        }        
    }

    public double convertTo(Coin otherCoin) {
    
        if (otherCoin instanceof Dollar) {
            return convertToDollar(otherCoin);
        } else if (otherCoin instanceof Real) {
            return convertToReal(otherCoin);
        } else if (otherCoin instanceof Euro) {
            return convertToEuro(otherCoin);
        } else {
            return this.value / otherCoin.value;
        }
    }

    public double convertToDollar(Coin otherCoin) {
        double resultado = otherCoin.getValue() / this.value;
        resultado = Math.round(resultado * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(resultado));
    }

    public double convertToReal(Coin otherCoin) {
        double resultado = otherCoin.getValue() / this.value;
        resultado = Math.round(resultado * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(resultado));
    }

    public double convertToEuro(Coin otherCoin) {
        double resultado = this.value / otherCoin.getValue();
        resultado = Math.round(resultado * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(resultado));
    }

    public double totalConvertido() {
        if (this.coinsList.isEmpty()){
            return 0.0;
        }
        double total = 0.0;

        for (Coin coin : coinsList) {
            total += coin.convert();
            }

        return total;
    }
}
