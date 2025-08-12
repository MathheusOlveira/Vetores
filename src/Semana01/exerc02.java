package br.com.devsdoagi.ExercPart1;

import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");
        }
    }
}
