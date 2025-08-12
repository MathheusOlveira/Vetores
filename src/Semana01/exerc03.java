package Semana01;
import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {
        double peso, altura, imc;

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe seu peso: ");
        peso = sc.nextDouble();

        System.out.print("Informe sua altura: ");
        altura = sc.nextDouble();

        imc =  peso / (altura * altura);

        System.out.printf("Imc: %.1f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III (mórbida)");
        }

        /*if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III (mórbida)");
        }*/


        sc.close();

    }
}
