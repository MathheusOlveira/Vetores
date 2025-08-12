package vetores1208;

public class saldoAcumuladoMax09 {
    public static double calcularSaldoTotal(double[][] matriz) {
        double total = 0;
        for (double[] linha : matriz) {
            for (double valor : linha) {
                total += valor;
            }
        }
        return total;
    }

    public static double[] encontrarMaximoPorConta(double[][] matriz) {
        double[] maximos = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            double max = matriz[i][0];
            for (double valor : matriz[i]) {
                if (valor > max) {
                    max = valor;
                }
            }
            maximos[i] = max;
        }
        return maximos;
    }

    public static void main(String[] args) {
        double[][] matriz = {
                {123, 145, 167},
                {189, 169, 1000}
        };

        double total = calcularSaldoTotal(matriz);
        System.out.println("Saldo total acumulado: " + total);

        double[] maximos = encontrarMaximoPorConta(matriz);
        for (int i = 0; i < maximos.length; i++) {
            System.out.println("Saldo máximo da conta " + (i + 1) + ": " + maximos[i]);
        }
    }
}
