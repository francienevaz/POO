package com.empresa;
// import java.util.*;
// falta fazer os inputs do usuário, configurar para inputs no switch case

public class Main {
    public static void main(String[] args) {
        // Menu menu = new Menu();
        // menu.exibirMenuPrincipal();

            Cofrinho cofrinho = new Cofrinho();
        
            Real doisReais = new Real(2);
            Dollar vinteEcincoDolares = new Dollar(25);
            Euro cinquentaEuros = new Euro(50);
        
            System.out.println("Conversão Dolar para Euro e Real:");
        
            System.out.println(cofrinho.convertToEuro(vinteEcincoDolares));
            System.out.println(cofrinho.convertToReal(vinteEcincoDolares));
        
            System.out.println("Conversão Euro para Dollar e Real:");
            System.out.println(cofrinho.convertToDollar(cinquentaEuros));
            System.out.println(cofrinho.convertToReal(cinquentaEuros));
        
            cofrinho.addCoin(doisReais);
            cofrinho.addCoin(vinteEcincoDolares);
            cofrinho.addCoin(cinquentaEuros);
            cofrinho.addCoin(new Real(3));
        
            System.out.println("Moedas no cofrinho:");
            cofrinho.listCoins();
        
        }

}
