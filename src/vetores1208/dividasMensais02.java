package vetores1208;

import java.util.Scanner;

public class dividasMensais02 {
    public static void preencherMatriz2(double[][] matriz) {

        /*
        matriz[0][0] = 150;
        matriz[0][1] = 50;
        matriz[0][2] = 500;
        matriz[0][3] = 600;
        matriz[1][0] = 550;
        matriz[1][1] = 90;
        matriz[1][2] = 600;
        matriz[1][3] = 100;
        matriz[2][0] = 300;
        matriz[2][1] = 80;
        matriz[2][2] = 400;
        matriz[2][3] = 200;
         */
        Scanner sc=new Scanner(System.in);
        for (int l=0; l < matriz.length; l++){
            for (int c=0; c < matriz[l].length; c++){
                System.out.print("Digite o valor: ");
                matriz[l][c]=sc.nextDouble();
            }
        }
    }

    public static double encontrarMaiorValor(double[][] matriz) {
        double maior = matriz[0][0];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] > maior){
                    maior = matriz[l][c];
                }
            }
        }
        return maior;
    }
    public static void main(String[] args){
        double[][] matriz = new double[3][4];
        preencherMatriz2(matriz);
        System.out.println("Maior valor: " + encontrarMaiorValor(matriz));

        /*
        double[][] mat={{100,100,100,100},
                        {150,100,100,100},
                        {100,100,100,100},
                        };
                        para criar/formular matriz e testar de forma manual
         */

    }
}
