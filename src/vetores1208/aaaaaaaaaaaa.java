package vetores1208;

public class aaaaaaaaaaaa {
    public static void main(String[] args) {

        int[] vetor = {20, 40, 10, 25, 45, 30};
        for (int p = 0; p < vetor.length - 1; p++) {
            for (int i = p + 1; i < vetor.length - 2; i++) {
                if (vetor[p] > vetor[p + 1]) {
                    int temp = vetor[p];
                    vetor[p] = vetor[p + 1];
                    vetor[p + 1] = temp;
                }
            }
        }
        System.out.print("Vetor ordenado: ");
        for (int j : vetor) {
            System.out.print(j + " ");

        /*
        int[] numero = {20,40,10,25,45,30};

        for (int n : numero){
            System.out.println("Número: " + n);
        }

        int[] valores = {10,45,6,23};
        valores[2] = 15;

        for (int i = 0; i < valores.length ; i++) {
            System.out.println(valores[i]);
        }
         */

        }
    }
}
