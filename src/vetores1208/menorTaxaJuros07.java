package vetores1208;

public class menorTaxaJuros07 {
    public static void main(String[] args) {
        double[][] matriz = {
                {6.9, 9.6},
                {5.9, 2.3}
        };

        double menorTaxa = encontrarMenorTaxa(matriz);
        double[] mediasPorMes = calcularMediaPorMes(matriz);

        System.out.println("Menor taxa: " + menorTaxa);
        for (int i = 0; i < mediasPorMes.length; i++) {
            System.out.println("Média do mês " + (i + 1) + ": " + mediasPorMes[i]);
        }
    }

    public static double encontrarMenorTaxa(double[][] matriz) {
        double menor = Double.POSITIVE_INFINITY;
        for (double[] linha : matriz) {
            for (double taxa : linha) {
                if (taxa < menor) {
                    menor = taxa;
                }
            }
        }
        return menor;
    }

    public static double[] calcularMediaPorMes(double[][] matriz) {
        double[] medias = new double[matriz[0].length];
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            double soma = 0;
            for (int linha = 0; linha < matriz.length; linha++) {
                soma += matriz[linha][coluna];
            }
            medias[coluna] = soma / matriz.length;
        }
        return medias;
    }
}
