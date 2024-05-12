package com.empresa;

import java.util.ArrayList;

public class Cofrinho {
    
    private ArrayList<Float> coins = new ArrayList<>(); // Renomeie para coins em vez de Coin

    public void addCoin(float coin) {
        coins.add(coin); // Adiciona a moeda à lista
        System.out.println("Moeda adicionada: " + coin);
    }

    public void removeCoin(float coin) {
        coins.remove(coin); // Remove a moeda da lista
        System.out.println("Moeda removida: " + coin);
    }

    public void listCoins() {
        System.out.println("Moedas no cofrinho:");
        for (float coin : coins) {
            System.out.println(coin);
        }
    }

    public void convertToReal() {
        System.out.println("Convertendo para Real...");
        // Lógica para converter moedas para Real
    }
}
