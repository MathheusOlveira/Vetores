package vetores1208;

public class totalFundoTrimestre06 {
    public static void main(String[] args) {
        double[][] matriz = {
                {80085, 16969},
                {12345, 19876},
                {20505, 21011}
        };

        double[] totais = calcularTotalPorFundo(matriz);

        for (int i = 0; i < totais.length; i++) {
            System.out.println("Total investido no fundo " + (i + 1) + ": R$ " + totais[i]);
        }
    }

    public static double[] calcularTotalPorFundo(double[][] matriz) {
        double[] totais = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            double soma = 0;
            for (double valor : matriz[i]) {
                soma += valor;
            }
            totais[i] = soma;
        }

        return totais;
    }
}
