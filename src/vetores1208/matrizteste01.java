package vetores1208;

import java.util.Arrays;
import java.util.Scanner;
public class matrizteste01 {
    public static void preencherMatriz(double[][]matriz){
        /*
        matriz[0][0] = 169;
        matriz[0][1] = 69;
        matriz[1][0] = 569;
        matriz[1][1] = 679;
         */
      Scanner sc=new Scanner(System.in);

      for (int l=0; l < matriz.length; l++){
          for (int c=0; c < matriz[l].length; c++){
              System.out.print("Digite o valor: ");
              matriz[l][c]=sc.nextDouble();
          }
      } // usando l = linha e c = coluna
        // mudar de void para double para poder usar -> return matriz;
    }
    public static double calcularSomaTotal(double[][]matriz){
        int soma = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                soma += matriz[l][c]; // -> soma = soma + matriz[l][c]
            }
        }
        return soma;
    }

    public static void main(String[] args){
        double[][] matriz = new double[2][2];
        preencherMatriz(matriz);
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("Soma Total: " + calcularSomaTotal(matriz));
    }

}
