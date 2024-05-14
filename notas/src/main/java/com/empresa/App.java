package com.empresa;

public class App {
    public static void main( String[] args ) {
        // write your code here
        Nota julia = new Nota();

        Nota marcos = new Nota(9, 6, 5);

        System.out.println("Média Marcos: " );
        marcos.resultado();
        System.out.println();

        julia.setNota1(7);
        julia.setNota2(3);
        julia.setFaltas(4);

        julia.resultado();

        julia.setNota2(8);
        julia.setFaltas(8);

        julia.resultado();
    }
}
