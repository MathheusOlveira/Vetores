package br.com.devsdoagi.Vetores;

public class tendenciaKesede {

    public static int[] primeiraTrincaAlta(double[] precos) {
        for (int i = 0; i < precos.length - 2; i++) {
            if (precos[i] < precos[i + 1] && precos[i + 1] < precos[i + 2]) {
                return new int[]{i, i + 1, i + 2};
            }
        }
        return null;
    }

    public static int[] primeiraTendenciaAlta(double[] precos) {
        int cont = 1;
        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[i - 1]) {
                cont++;
                if (cont >= 3) {
                    return new int[]{i - 2, i - 1, i};
                }
            } else {
                cont = 1;
            }
        }
        return null;
    }

    public static void todasTendenciasAlta(double[] precos) {
        int cont = 1;
        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[i - 1]) {
                cont++;
                if (cont >= 3) {
                    System.out.println("Tendência de alta até o índice " + i);
                }
            } else {
                cont = 1;
            }
        }
    }

    public static void main(String[] args) {
        double[] precos = {105, 102, 103, 104, 105, 100, 101, 107, 108, 109};
        int[] trinca = primeiraTrincaAlta(precos);
        if (trinca != null) {
            System.out.println("Primeira trinca: " + trinca[0] + ", " + trinca[1] + ", " + trinca[2]);
        } else {
            System.out.println("Sem tendência de alta");
        }
        todasTendenciasAlta(precos);
    }
}