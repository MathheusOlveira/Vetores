package Semana01;
import java.util.Scanner;

import static br.com.devsdoagi.ExercPart3.calcularJurosComposto.conversao8;

public class metodos08 {
    public static void main(String[] args) {
        double capital, taxa;
        int meses;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Capital Inicial: R$");
        capital = sc.nextDouble();
        System.out.println("Informe a Taxa mensal: ");
        taxa = sc.nextDouble();
        System.out.println("Informe a quantidade de meses R$");
        meses = sc.nextInt();

        double montanteFinal = conversao8(capital, taxa, meses);
        System.out.println("Montante final: R$ " + montanteFinal);
    }
}
