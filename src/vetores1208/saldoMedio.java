package vetores1208;

import java.util.Arrays;

public class saldoMedio {
    public static void preencherMatriz3(double[][] matriz) {

        matriz[0][0] = 150.0;
        matriz[0][1] = 50.0;
        matriz[1][0] = 150.0;
        matriz[1][1] = 50.0;
        matriz[2][0] = 150.0;
        matriz[2][1] = 50.0;

    }

    public static double calcularSomaTotal2(double[][]matriz){
        double soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
    public static double[] mediaTotal(double[][]matriz) {
        double soma = 0;
        double[] media = new double[3];
        int j, i;

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                soma = soma + matriz[i][j];
            }
            media[i] = soma / matriz[j].length;
            soma = 0;
        }
        return media;
    }
    public static void main(String[] args){
        double[][] matriz = new double[3][2];
        double[] media;
        preencherMatriz3(matriz);
        System.out.println("Soma: " + calcularSomaTotal2(matriz));
        media = mediaTotal(matriz);
      //  for (int i = 0; i < mediaTotal(matriz).length; i++) {}
        System.out.println(Arrays.toString(mediaTotal(matriz)));
    }
}
