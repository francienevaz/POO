package com.empresa;

import java.text.DecimalFormat;
import java.util.*;

public class Menu {

    private Scanner sc;
    private Cofrinho cofrinho;

    public Menu() {
        sc = new Scanner(System.in);
        cofrinho = new Cofrinho();        
    }

    public void exibirMenuPrincipal() {
        
        System.out.println("Bem-vindo ao Cofrinho");
        
        boolean sair = false;
        while (!sair) {
            
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Moedas");
            System.out.println("2 - Remover Moedas");
            System.out.println("3 - Listar todas as Moedas");
            System.out.println("4 - Converter total do cofrinho para Real");
            System.out.println("5 - Encerrar sessão");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    exibirSubMenuAdicionarMoedas();
                    break;
                case 2:
                    exibirSubMenuRemoverMoedas();
                    break;
                case 3:
                    cofrinho.listCoins();
                    break;
                case 4: 
                    double valorTotalConvertido = cofrinho.totalConvertido();
                    double resultado = Math.round(valorTotalConvertido * 100.0) / 100.0;
                    DecimalFormat df = new DecimalFormat("#.##");
                    Double.parseDouble(df.format(resultado));
                    System.out.println("Valor total convertido para Real: " + resultado);
                    break;
                case 5:
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

    private void exibirSubMenuAdicionarMoedas() {
        System.out.println("Escolha a moeda:");
        System.out.println("1 - Real:");
        System.out.println("2 - Dolar:");
        System.out.println("3 - Euro:");

        int opcaoMoeda = sc.nextInt();

        System.out.println("Digite um valor: ");
        String valorMoeda = sc.next();
        valorMoeda = valorMoeda.replace(",", ".");
        double valorMoedaConvertida = Double.parseDouble(valorMoeda);

        Coin moeda = null;

        switch (opcaoMoeda) {
            case 1:
                moeda = new Real(valorMoedaConvertida);
                break;
            case 2:
                moeda = new Dollar(valorMoedaConvertida);
                break;
            case 3:
                moeda = new Euro(valorMoedaConvertida);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        cofrinho.addCoin(moeda);
        moeda.info();
        System.out.println("Moeda adicionada com sucesso!");
    }

    private void exibirSubMenuRemoverMoedas() {
        System.out.println("Escolha a moeda:");
        System.out.println("1 - Real:");
        System.out.println("2 - Dolar:");
        System.out.println("3 - Euro:");

        int opcaoMoeda = sc.nextInt();

        System.out.println("Digite um valor: ");
        String valorMoeda = sc.next();
        valorMoeda = valorMoeda.replace(",", ".");
        double valorMoedaConvertida = Double.parseDouble(valorMoeda);

        Coin moeda = null;

        switch (opcaoMoeda) {
            case 1:
                moeda = new Real(valorMoedaConvertida);
                break;
            case 2:
                moeda = new Dollar(valorMoedaConvertida);
                break;
            case 3:
                moeda = new Euro(valorMoedaConvertida);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        if (cofrinho.removeCoin(moeda)) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Moeda não encontrada!");
        }
    }
}

