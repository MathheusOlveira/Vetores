package vetores1208;

public class mediaSoma05 {
    public static void main(String[] args) {
        double[][] matriz = {
                {169, 269, 369},
                {469, 569, 669},
                {69, 969, 609}
        };
        System.out.println("Média total vendas: " + calcularMediaTotal(matriz));
        double[] somaVendedor = somarVendasPorVendedor(matriz);
        for (int i = 0; i < somaVendedor.length; i++) {
            System.out.printf("Total vendedor %d: %.2f%n", i + 1, somaVendedor[i]);
        }
    }

    public static double calcularMediaTotal(double[][] matriz) {
        double soma = 0;
        int quantidade = 0;

        for (double[] linha : matriz) {
            for (double valor : linha) {
                soma += valor;
                quantidade++;
            }
        }
        return soma / quantidade;
    }

    public static double[] somarVendasPorVendedor(double[][] matriz) {
        double[] somaPorVendedor = new double[matriz.length];

        int i = 0;
        for (double[] linha : matriz) {
            double somaLinha = 0;
            for (double valor : linha) {
                somaLinha += valor;
            }
            somaPorVendedor[i] = somaLinha;
            i++;
        }
        return somaPorVendedor;
    }

}
