package vetores1208;

public class pagamentoMediaMax10 {
    public static void main(String[] args) {
        double[][] matriz = {
                {100, 100, 169},
                {200, 200, 269},
                {300, 300, 369}
        };

        double media = calcularMediaTotal(matriz);
        int clienteMaiorPagamento = encontrarClienteMaiorPagamento(matriz);

        System.out.println("Média total dos pagamentos: " + media);
        System.out.println("Cliente com maior pagamento total: Cliente " + clienteMaiorPagamento);
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

    public static int encontrarClienteMaiorPagamento(double[][] matriz) {
        double maiorSoma = Double.MIN_VALUE;
        int clienteIndex = -1;

        for (int i = 0; i < matriz.length; i++) {
            double somaCliente = 0;
            for (double valor : matriz[i]) {
                somaCliente += valor;
            }
            if (somaCliente > maiorSoma) {
                maiorSoma = somaCliente;
                clienteIndex = i;
            }
        }
        return clienteIndex;
    }
}
