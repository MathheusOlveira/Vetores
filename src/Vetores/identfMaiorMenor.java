package br.com.devsdoagi.Vetores;

import java.util.Scanner;

public class identfMaiorMenor {

    public static double maiorPreco(double[] precos) {
        double maior = precos[0];

        /*
        for (int i=0; i < precos.length;i++){
            if(precos[i] > maior){
                maior=precos[i];
            }
        }

         */

        for (double p : precos){
            if(p>maior){
                maior=p;
            }
        }
        return maior;
    }

    public static double menorPreco(double[] precos) {
        double menor = precos[0];
        for (int i=0; i < precos.length;i++){
            if(precos[i] < menor){
                menor=precos[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
       double[] precos={100,102,104,110,100,102,110,115,112,104};

        System.out.println("Maior preço: " + maiorPreco(precos));
        System.out.println("Menorr preço: " + menorPreco(precos));

       /*
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[10];

        System.out.println("Digite os preços diários (10 dias):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }
        System.out.printf("Maior preco: ", maiorPreco(precos));
        System.out.printf("Maior preco: ", menorPreco(precos));
        */
    }

}
