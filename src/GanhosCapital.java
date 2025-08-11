import java.util.Scanner;

public class GanhosCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] compra = new double[5];
        double[] venda = new double[5];
        double[] lucro = new double[5];

        System.out.println("Digite os preços de COMPRA dos 5 ativos:");
        for (int i = 0; i < compra.length; i++) {
            System.out.print("Ativo " + (i + 1) + ": ");
            compra[i] = sc.nextDouble();
        }

        System.out.println("\nDigite os preços de VENDA dos 5 ativos:");
        for (int i = 0; i < venda.length; i++) {
            System.out.print("Ativo " + (i + 1) + ": ");
            venda[i] = sc.nextDouble();
        }

        for (int i = 0; i < lucro.length; i++) {
            lucro[i] = venda[i] - compra[i];
        }

        double lucroTotal = 0;
        for (int i = 0; i < lucro.length; i++) {
            lucroTotal += lucro[i];
        }

        double imposto = 0;
        if (lucroTotal > 20000) {
            imposto = lucroTotal * 0.15;
        }

        System.out.println("\nLucro/Prejuízo por ativo:");
        for (int i = 0; i < lucro.length; i++) {
            System.out.printf("Ativo %d: R$ %.2f%n", (i + 1), lucro[i]);
        }

        System.out.printf("\nLucro total: R$ %.2f%n", lucroTotal);
        System.out.printf("Imposto devido: R$ %.2f%n", imposto);

        sc.close();
    }
}
