package vetores1208;

public class analiseSaldoConta {
    public static double saldoFinal(double[][] saldos, int cliente) {
        return saldos[cliente][saldos[cliente].length - 1];
    }

    public static double[] saldoFinalTodos(double[][] saldos) {
        double[] finais = new double[saldos.length];
        for (int i = 0; i < saldos.length; i++) {
            finais[i] = saldoFinal(saldos, i);
        }
        return finais;
    }

    public static void imprimirExtratoClientes(double[][] saldos) {
        System.out.println("Extrato dos clientes:");
        for (int i = 0; i < saldos.length; i++) {
            System.out.print("Cliente " + (i + 1) + ": ");
            for (double saldo : saldos[i]) {
                System.out.print(saldo + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] saldos = {
                {199, 250, 78, 89},
                {100, 1400, 950, 79},
                {69, 169, 1069, 1669}
        };

        imprimirExtratoClientes(saldos);

        System.out.println("\nSaldo final do cliente 1: " + saldoFinal(saldos, 0));

        double[] finais = saldoFinalTodos(saldos);
        System.out.println("\nSaldos finais de todos os clientes:");
        for (int i = 0; i < finais.length; i++) {
            System.out.println("Cliente " + (i + 1) + ": " + finais[i]);
        }
    }
}
