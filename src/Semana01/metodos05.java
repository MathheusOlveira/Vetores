package Semana01;
import java.util.Scanner;

import static br.com.devsdoagi.ExercPart3.compararAtivos.conversao5;

public class metodos05{
    public static void main(String[] args){
        double a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Ativo1: ");
        a = sc.nextDouble();
        System.out.println("Informe Ativo2: ");
        b = sc.nextDouble();

        double conversao = conversao5(a,b);
        System.out.printf("Maior Ativo: %.1f", conversao);

    }
}