package vetores1208;

public class vendaMesSoma08 {
    public static void main(String[] args) {
        int[][] matriz = {
                {10, 20},
                {30, 40},
                {59, 69}
        };

        int[] totalPorMes = somarVendasPorMes(matriz);

        for (int i = 0; i < totalPorMes.length; i++) {
            System.out.println("Total vendido no mês " + (i + 1) + ": " + totalPorMes[i]);
        }
    }

    public static int[] somarVendasPorMes(int[][] matriz) {
        int colunas = matriz[0].length;
        int[] somaPorMes = new int[colunas];

        for (int[] linha : matriz) {
            for (int j = 0; j < colunas; j++) {
                somaPorMes[j] += linha[j];
            }
        }

        return somaPorMes;
    }
}
