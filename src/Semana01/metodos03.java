package br.com.devsdoagi.ExercPart3;

import java.util.Scanner;

import static br.com.devsdoagi.ExercPart3.calcularCrescimento.conversao3;

public class metodos03{
    public static void main(String[] args){
        double a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe valor do primeiro dia: R$");
        a = sc.nextDouble();
        System.out.print("\nInforme valor do segundo dia: R$");
        b = sc.nextDouble();

        double conversao = conversao3(a,b);
        System.out.printf("Crescimento: %.2f%%\n", conversao);
    }
}