package Semana01;
import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        if(num < 0){
            System.out.println("Numero negativo");
        }else if( num > 0){
            System.out.println("Numero positivo");
        }
        else{
            System.out.println("Zer0");
        }
        sc.close();
    }
}
