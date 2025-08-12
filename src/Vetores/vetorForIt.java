package Vetores;

import java.util.Arrays;

public class vetorForIt {

    public static void main(String[] args) {
        double num[] = {3.5, 5.75, 1.25, 8, -4.5};
        Arrays.sort(num);
        for (double valor : num) {
            System.out.print(valor + " ");
        }
    }
}
