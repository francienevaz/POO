package com.empresa;
// import java.util.*;

public class Conta {
    // definir as variáveis e os repectivos tipos:
    private String nome;
    private int numeroConta;
    private double saldoInicial;
    private double limite;
    // private Scanner teclado;

    //  Criar o construtor: 
    public Conta(int numeroConta, String titular, double saldo, double limite) {
        this.nome = titular;
        this.numeroConta = numeroConta;
        this.saldoInicial = saldo;
        this.limite = limite;
        // this.teclado = new Scanner(System.in);
    }

    public boolean depositar( double valor) {
        // teclado = new Scanner(System.in);
        // System.out.println("Digite o valor a ser depositado:");
        // double valord = teclado.nextDouble();
        
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return false;
        } else {
            this.saldoInicial += valor;  
            System.out.println("Depósito realizado com sucesso!");
            return true;
        }
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return false;
        } else if (valor > this.saldoInicial + this.limite) {
            System.out.println("Saldo insuficiente!");
            return false;
        } else {
            this.saldoInicial -= valor;
            System.out.println("Saque realizado com sucesso!");
            return true;
        }
    }

    public void info() {
        System.out.println("Titular: " + this.nome);
        System.out.println("Numero da Conta: " + this.numeroConta);
        System.out.println("Saldo Atual: " + this.saldoInicial);
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Implementar getters e setters para os demais atributos
}