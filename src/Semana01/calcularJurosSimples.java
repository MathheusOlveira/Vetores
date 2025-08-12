package br.com.devsdoagi.ExercPart3;

import java.util.Scanner;

public class calcularJurosSimples {
    public static double conversao2(double capInicial, double taxa, double tempoAnos) {
        //taxa = taxa / 100;
        return capInicial + capInicial * (taxa / 100) * tempoAnos ;
    }
}