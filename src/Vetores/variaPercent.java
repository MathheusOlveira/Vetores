package br.com.devsdoagi.Vetores;

import java.util.Scanner;

public class variaPercent {

    public static double[] variacaoDiaria(double[] precos){
        double[] variacao = new double[precos.length-1];
        for(int i=0; i<precos.length-1; i++){
            variacao[i] = ((precos[i+1] - precos[i]) / precos[i]) * 100;
        }
        return variacao;
    }

    public static void main(String[] args) {
        double[] precos = {100, 102, 104, 110, 100};
        double[] var = variacaoDiaria(precos);

        for (double v:var){
            System.out.println(v);
        }
    }
}
