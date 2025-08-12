package br.com.devsdoagi.Vetores;

import java.util.Scanner;

public class vetoresTeste {
    public static void main(String[] args) {

        int[] numeros = {10,20,30,40};

        for (int n : numeros){
            System.out.println("Número: " + n);
        }

        int[] valores = {10,45,6,23};
        valores[2] = 15;

        for (int i = 0; i < valores.length ; i++) {
            System.out.println(valores[i]);
        }

    }
}