package br.com.devsdoagi.Vetores;

import java.util.Scanner;

public class tendencia {

    public static double[] primeiraTrincaAlta(double[] precos) {
        for (int i = 0; i < precos.length - 2; i++) {
            if (precos[i] < precos[i + 1] && precos[i + 1] < precos[i + 2]) {
                return new double[]{precos[i],precos[i +1],precos[i + 2]};
            }
        }
        return null;
    }

    public static int[] primeiraTendenciaAlta(double[] precos) {
        for (int i = 0; i < precos.length - 2; i++) {
            int cont = 1;
            for (int j = i; j < precos.length - 1; j++) {
                if (precos[j] < precos[j + 1]) {
                    cont++;
                } else {
                    break;
                }
                if (cont >= 3) {
                    int[] indices = new int[cont];
                    for (int k = 0; k < cont; k++) {
                        indices[k] = i + k;
                    }
                    return indices;
                }
            }
        }
        return null;
    }

    public static void todasTendenciasAlta(double[] precos) {
        for (int i = 0; i < precos.length - 2; i++) {
            int cont = 1;
            for (int j = i; j < precos.length - 1; j++) {
                if (precos[j] < precos[j + 1]) {
                    cont++;
                } else {
                    break;
                }
            }
            if (cont >= 3) {
                System.out.print("Dias: ");
                for (int k = 0; k < cont; k++) {
                    System.out.print((i + k) + " ");
                }
                System.out.println();
                i += cont - 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[10];

        System.out.println("Digite os preços diários da ação (10 dias):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }

        double[] trinca = primeiraTrincaAlta(precos);
        if (trinca != null) {
            System.out.println("Primeira trinca de alta encontrada nos dias: " +
                    trinca[0] + ", " + trinca[1] + ", " + trinca[2]);
        } else {
            System.out.println("Nenhuma trinca de alta encontrada.");
        }

        int[] tendencia = primeiraTendenciaAlta(precos);
        if (tendencia != null) {
            System.out.print("Primeira tendência de alta (>=3 dias consecutivos) nos dias: ");
            for (int dia : tendencia) {
                System.out.print(dia + " ");
            }
            System.out.println();
        } else {
            System.out.println("Nenhuma tendência de alta encontrada.");
        }
        System.out.println("Todas as tendências de alta encontradas:");
        todasTendenciasAlta(precos);

        sc.close();
    }
}