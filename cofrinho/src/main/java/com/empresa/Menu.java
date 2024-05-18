package com.empresa;

import java.util.*;

public class Menu {

    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        Cofrinho cofrinho = new Cofrinho(); // Criar uma instância da classe Cofrinho

        boolean sair = false;
        while (!sair) {
            System.out.println("Bem-vindo ao Cofrinho");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Moedas");
            System.out.println("2 - Remover Moedas");
            System.out.println("3 - Listar todas as Moedas");
            System.out.println("4 - Converter para Real");
            System.out.println("5 - Converter para Dolar");
            System.out.println("6 - Converter para Euro");
            System.out.println("7 - Encerrar sessão");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor da moeda:");
                    float valor = sc.nextFloat();
                    Real moeda = new Real(valor);
                    cofrinho.addCoin(moeda); // Chamar o método addCoin da instância de Cofrinho
                    break;
                case 2:
                    System.out.println("Digite o valor da moeda a ser removida:");
                    float valorRemover = sc.nextFloat();
                    Real moedaRemovida = new Real(valorRemover); // Crie um objeto Real com o valor digitado
                    cofrinho.removeCoin(moedaRemovida); // Chame o método removeCoin com o objeto Real
                    break;
                case 3:
                    cofrinho.listCoins(); // Chamar o método listCoins da instância de Cofrinho
                    break;
                case 4:
                    System.out.println("Convertendo para Real...");
                    Coin real = new Real(1); // Crie um objeto Real com o valor de 1 real
                    double resultado = cofrinho.convertTo(real); // Chame o método convertTo com o objeto Real
                    System.out.println("Valor em reais: " + resultado);
                    break;
                case 5:
                    System.out.println("Convertendo para Dólar...");
                    Coin dollar = new Dollar(1); // Crie um objeto Dollar com o valor de 1 dólar
                    double resultadoDollar = cofrinho.convertTo(dollar); // Armazena o resultado da conversão
                    System.out.println("Valor em dólares: " + resultadoDollar); // Exibe o valor convertido
                    break;
                case 6:
                    System.out.println("Convertendo para Euro...");
                    Coin euro = new Euro(1); // Crie um objeto Euro com o valor de 1 euro
                    cofrinho.convertTo(euro); // Chame o método convertTo com o objeto Euro
                    break;
                case 7:
                    // Encerra o programa
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
        sc.close();
    }    

}
