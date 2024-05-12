package com.empresa;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cofrinho cofrinho = new Cofrinho(); // Criar uma instância da classe Cofrinho

        System.out.println("Bem-vindo ao Cofrinho");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar Moedas");
        System.out.println("2 - Remover Moedas");
        System.out.println("3 - Listar todas as Moedas");
        System.out.println("4 - Converter para Real");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor da moeda:");
                float valor = scanner.nextFloat();
                cofrinho.addCoin(valor); // Chamar o método addCoin da instância de Cofrinho
                break;
            case 2:
                System.out.println("Digite o valor da moeda a ser removida:");
                float valorRemover = scanner.nextFloat();
                cofrinho.removeCoin(valorRemover); // Chamar o método removeCoin da instância de Cofrinho
                break;
            case 3:
                cofrinho.listCoins(); // Chamar o método listCoins da instância de Cofrinho
                break;
            case 4:
                cofrinho.convertToReal(); // Chamar o método convertToReal da instância de Cofrinho
                break;
            default:
                System.out.println("Digite uma opção válida!");
                break;
        }

        scanner.close();
    }
}
