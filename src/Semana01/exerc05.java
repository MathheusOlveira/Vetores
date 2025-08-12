package br.com.devsdoagi.ExercPart1;

import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args) {
        int nota;

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe sua Nota Final: ");
        nota = sc.nextInt();

        if (nota >= 6) {
            System.out.print("Você está Aprovado!");
        }
        else if (nota >= 4 && nota < 6) {
            System.out.print("Você está de Exame :C");
        } else {
            System.out.print("Você está Reprovado ;-; ");
        }
    }
}