package Semana01;
public class calcularJurosComposto {
    public static double conversao8(double capitalInicial, double taxaMensal, int meses) {
        double fator = 1.0;

        for (int i = 0; i < meses; i++) {
            fator *= (1 + taxaMensal);
        }

        double montante = capitalInicial * fator;

        montante = ((int) (montante * 100 + 0.5)) / 100.0;

        return montante;
    }
}
