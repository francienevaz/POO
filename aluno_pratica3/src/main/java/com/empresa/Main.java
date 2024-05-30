package com.empresa;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Juliana", 111, 0.1, new Curso("ADS", 1000));

        a1.info();
        System.out.println("Pagamento: " + a1.pagamento());
    }
}