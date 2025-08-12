package Semana01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("yo");
        int idade;
        int numero;
        float altura;
        String nome;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        altura = sc.nextFloat();

        System.out.print("Digite seu Nome: ");
        nome = sc.next();

        System.out.printf("%s tem %d anos, e %2f de altura.", nome,idade,altura);

        if (idade >= 18) {
            System.out.printf("\n%s é maior de Idade", nome);
        } else {
            System.out.printf("%s é menor de Idade", nome);
        }
        System.out.printf("\n%s digite um numero: ",nome);
        numero = sc.nextInt();
        if (numero > 0 && numero < 100) {
            System.out.println("\n Entre 1 e 99");
        }else{
            System.out.println("Acima de 100");
        }


    }
}
