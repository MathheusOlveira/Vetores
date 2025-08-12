package vetores1208;

import java.util.Arrays;

public class menorValor04 {
    public static void preencherMatriz(double[][]matriz){

        matriz[0][0] = 150;
        matriz[1][0] = 50;
        matriz[0][1] = 500;
        matriz[1][1] = 600;
        matriz[0][2] = 550;
        matriz[1][2] = 90;

    }
    public static double[] encontrarMenorValor(double[][] matriz) {
        double[] menorpreco=new double[matriz[0].length];
        for (int p = 0; p < matriz[0].length; p++) {    // matriz[0].length usado que o for externo fixe a linha e percorra as colunas
            menorpreco[p] = matriz[0][p];
            for (int l = 0; l < matriz.length; l++) {   // matriz.length está sendo usado para que o for interno consgia percorrer todas as linhas
                if (matriz[l][p] < menorpreco[p]){
                    menorpreco[p] = matriz[l][p];
                }
            }
        }
        return menorpreco;
    }

    public static void main(String[] args){
        double[][] matriz = new double[2][3];
        preencherMatriz(matriz);
        System.out.println("Menor valor de cada produto: " + Arrays.toString(encontrarMenorValor(matriz)));
    }

}
