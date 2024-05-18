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
            System.out.println("5 - Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor da moeda:");
                    float valor = sc.nextFloat();
                    Real real = new Real(valor);
                    cofrinho.addCoin(real); // Chamar o método addCoin da instância de Cofrinho
                    break;
                case 2:
                    System.out.println("Digite o valor da moeda a ser removida:");
                    float valorRemover = sc.nextFloat();
                    Real moeda = new Real(valorRemover); // Crie um objeto Real com o valor digitado
                    cofrinho.removeCoin(moeda); // Chame o método removeCoin com o objeto Real
                    break;
                case 3:
                    cofrinho.listCoins(); // Chamar o método listCoins da instância de Cofrinho
                    break;
                case 4:
                    cofrinho.convertTo(); // Chamar o método convertToReal da instância de Cofrinho
                    break;
                case 5:
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
