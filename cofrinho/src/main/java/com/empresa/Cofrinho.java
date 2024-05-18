package com.empresa;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Coin> coins = new ArrayList<>(); // Renomeie para coins em vez de Coin
    private double value; // Defina a variável value

    public Cofrinho() {
        this.value = 0.0; // Inicializa a variável value com zero
    }     

    public void addCoin(Coin coin) {
        coins.add(coin); // Adiciona a moeda à lista
        this.value += coin.getValue(); // Atualiza o valor do campo value na classe Coin
        System.out.println("Moeda adicionada: " + coin.getValue());
    }

    public void removeCoin(Coin coin) {
        coins.remove(coin); // Remove a moeda da lista
        System.out.println("Moeda removida: " + coin.getValue());
    }

    public void listCoins() {
        System.out.println("Moedas no cofrinho:");
        for (Coin coin : coins) {
            System.out.println(coin.getValue());
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
}
