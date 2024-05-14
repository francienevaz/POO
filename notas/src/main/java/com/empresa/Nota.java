package com.empresa;

public class Nota {
    private double nota1;
    private double nota2;
    private int Falta;

    public Nota(){

    }

    //  ao criar o construtor aqui, podemos passar os valores por parâmetro quando chamamos a função Nota
    public Nota(double n1, double n2, int falta) {
        setNota1(n1);
        setNota2(n2);
        setFaltas(falta);
    }

    public void setNota1(double nota){
        if (nota < 0 || nota > 10) {
            System.out.println("Digite uma nota entre 1 e 10");
            return;
        }
        nota1 = nota;
    }

    public void setNota2(double nota){
        if (nota < 0 || nota > 10) {
            System.out.println("Digite uma nota entre 1 e 10");
            return;
        }
        nota2 = nota;
    }

    public boolean setFaltas(int falta) {

        boolean status = false;
        Falta += falta;

        System.out.println("Número de faltas: " + Falta);

        if (Falta > 7) {
            System.out.println(String.format("Número de faltas acima do permitido, aluno contabilizou %d faltas, aluno Reprovado por faltas! ", Falta));
            status = true;
        }

        return status;
    }

    public int getFaltas() {
        return Falta;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public void resultado(){
        if (Falta > 7) {
            System.out.println("Reprovado por faltas!");
        } else {
            double media = (nota1 + nota2) / 2;

            if(media < 4) {
                System.out.println("Reprovado");
            } else if (media < 7) {
                System.out.println("Em exame");
            } else {
                System.out.println(String.format("Média: %s", media));
                System.out.println("Aprovado");
            }
        }       
    }
}
