package com.empresa;

public class App {
    public static void main( String[] args ) {
        // write your code here
        Nota julia = new Nota();

        julia.setNota1(7);
        julia.setNota2(3);

        julia.resultado();

        julia.setNota2(8);

        julia.resultado();
    }
}
