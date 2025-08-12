package vetores1208;

public class dividasMensais {
    public static void preencherMatriz2(double[][] matriz) {

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
    }

    public static double encontrarMaiorValor(double[][] matriz) {
        double maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }
    public static void main(String[] args){
        double[][] matriz = new double[3][4];
        preencherMatriz2(matriz);
        System.out.println("Maior valor: " + encontrarMaiorValor(matriz));
    }
}
