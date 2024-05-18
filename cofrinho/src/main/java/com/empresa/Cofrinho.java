package com.empresa;

import java.util.ArrayList;

public class Cofrinho {
    
    private ArrayList<Coin> coins = new ArrayList<>(); // Renomeie para coins em vez de Coin

    public void addCoin(Coin coin) {
        coins.add(coin); // Adiciona a moeda à lista
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

    public void convertTo() {
        System.out.println("Convertendo para Real...");
        // Lógica para converter moedas para Real
    }
}
