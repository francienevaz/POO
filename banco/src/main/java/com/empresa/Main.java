package com.empresa;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(111, "José Carlos", 2000, 500);

        c1.info();

        c1.sacar(200);
        c1.depositar(2000);
        System.out.println();
        c1.info();

       
    }
}