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

            if (sc.hasNextInt()) {

                int opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        exibirSubMenuAdicionarMoedas();
                        break;
                    case 2:
                        exibirSubMenuRemoverMoedas();
                        break;
                    case 3:
                        cofrinho.listMoedas();
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
            } else {
                System.out.println("Digite uma opção válida!");
                sc.nextLine();
            }
        }
        sc.close();
    }    

    private void exibirSubMenuAdicionarMoedas() {
        System.out.println("Escolha a moeda:");
        System.out.println("1 - Real:");
        System.out.println("2 - Dolar:");
        System.out.println("3 - Euro:");
    
        if (sc.hasNextInt()) {
            int opcaoMoeda = sc.nextInt();
    
            System.out.println("Digite um valor: ");
            String valorMoeda = sc.next();
    
            if (!valorMoeda.isEmpty()) {
                try {
                    valorMoeda = valorMoeda.replace(",", ".");
                    double valor = Double.parseDouble(valorMoeda);
    
                    Moeda moeda = null;
    
                    switch (opcaoMoeda) {
                        case 1:
                            moeda = new Real(valor);
                            break;
                        case 2:
                            moeda = new Dolar(valor);
                            break;
                        case 3:
                            moeda = new Euro(valor);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
    
                    if (moeda != null) {
                        cofrinho.addMoeda(moeda);
                        moeda.info();
                        System.out.println("Moeda adicionada com sucesso!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido! Digite um número válido.");
                }
            } else {
                System.out.println("Digite um valor!");
            }
        } else {
            System.out.println("Digite uma opção válida!");
            sc.nextLine();
        }
    }    

    private void exibirSubMenuRemoverMoedas() {
        System.out.println("Escolha a moeda:");
        System.out.println("1 - Real:");
        System.out.println("2 - Dolar:");
        System.out.println("3 - Euro:");

        if (sc.hasNextInt()){
            int opcaoMoeda = sc.nextInt();

            System.out.println("Digite um valor: ");
            String valorMoeda = sc.next();
            valorMoeda = valorMoeda.replace(",", ".");
            double valorMoedaConvertida = Double.parseDouble(valorMoeda);

            Moeda moeda = null;

            try {
                switch (opcaoMoeda) {
                    case 1:
                        moeda = new Real(valorMoedaConvertida);
                        break;
                    case 2:
                        moeda = new Dolar(valorMoedaConvertida);
                        break;
                    case 3:
                        moeda = new Euro(valorMoedaConvertida);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }

                if (cofrinho.removerMoeda(moeda)) {
                    System.out.println("Moeda removida com sucesso!");
                } else {
                    System.out.println("Moeda não encontrada!");
                }
            } catch (Exception e) {
                System.out.println("Erro ao remover moeda: " + e.getMessage());
            } 
        }   else {
            System.out.println("Digite uma opção válida!");
            sc.nextLine();
        }        
    }
}