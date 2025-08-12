package br.com.devsdoagi.ExercPart3;

import java.util.Scanner;

import static br.com.devsdoagi.ExercPart3.calcularJurosSimples.conversao2;

public class metodos02 {
    public static void main(String[] args){
        double a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe valor Capital Inicial: R$ ");
        a = sc.nextDouble();
        System.out.println("Informe taxa: %");
        b = sc.nextDouble();
        //b = (b / 100);
        System.out.println("Informe tempo em Anos ");
        c = sc.nextDouble();

        double conversao = conversao2(a,b,c);
        System.out.printf("Montante Final: %.2f", conversao);
    }
}

