package Semana01;

import java.util.Scanner;

import static br.com.devsdoagi.ExercPart3.converterMoeda.conversao1;

 public class metodos01 {
    public static void main(String[] args){
        double a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe valor em Reais: R$ ");
        a = sc.nextDouble();
        System.out.println("Informe taxa atual do Dolar: ");
        b= sc.nextDouble();

        double conversao = conversao1(a,b);
        System.out.printf("Valor em Dolar: $%.2f", conversao);
    }
}

