package vetores1208;

public class matrizteste {
    public static void preencherMatriz(double[][]matriz){
        matriz[0][0] = 150;
        matriz[0][1] = 50;
        matriz[1][0] = 500;
        matriz[1][1] = 600;

    }
    public static double calcularSomaTotal(double[][]matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args){
        double[][] matriz = new double[2][2];
        preencherMatriz(matriz);
        System.out.println("Soma Total: " + calcularSomaTotal(matriz));
    }

}
