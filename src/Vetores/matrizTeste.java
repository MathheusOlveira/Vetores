package br.com.devsdoagi.Vetores;

public class matrizTeste {
    public static void main(String[] args){


        int[][] valores = {{30,25,42,18},{7,65,70,4}};

        valores[1][2] = 10;

        for (int i = 0; i < valores.length ; i++) {
            System.out.println(valores[i][i]);
        }



        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int[] linha : matriz) {
            for (int valor : linha){
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        /*
        for (int | = 0; | <2; |++){{
            for (int c = 0; c < 4; c++){
            valores[|][c];
         */

    }
}
