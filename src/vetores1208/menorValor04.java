package vetores1208;

public class menorValor04 {
    public static void preencherMatriz(double[][]matriz){

        matriz[0][0] = 150;
        matriz[1][0] = 50;
        matriz[0][1] = 500;
        matriz[1][1] = 600;
        matriz[0][2] = 550;
        matriz[1][2] = 90;

    }
    public static double encontrarMenorValor(double[][] matriz) {
        double menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static void main(String[] args){
        double[][] matriz = new double[2][3];
        preencherMatriz(matriz);
        System.out.println("Menor valor: " + encontrarMenorValor(matriz));
    }

}
