package com.empresa;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Menu menu = new Menu();
        // menu.exibirMenuPrincipal();

        Cofrinho cofrinho = new Cofrinho();
        cofrinho.listCoins();

        Real doisReais = new Real(2);
        Dollar cincoDolares = new Dollar(5);
        Euro vinteEcincoEuros = new Euro(25);
        Real treReais = new Real(3);

        cofrinho.addCoin(doisReais);
        cofrinho.addCoin(cincoDolares);
        cofrinho.addCoin(vinteEcincoEuros);
        cofrinho.addCoin(treReais);
        cofrinho.listCoins();

    }
}
