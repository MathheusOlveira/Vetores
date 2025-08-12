package br.com.devsdoagi.ExercPart1;

import java.util.Scanner;

public class exerc04 {

    public static void main(String[] args) {
        double valor, media, diferenca, percentual;

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o Valor: ");
        valor = sc.nextDouble();

        System.out.print("Informe a Média: ");
        media = sc.nextDouble();

        diferenca = Math.abs(valor - media) ;

        percentual = (diferenca / media) * 100;

        System.out.printf("O valor %.2f se aproxima da media %.2f na porcetagem: %.2f","%", valor, media, percentual);


    }
}
