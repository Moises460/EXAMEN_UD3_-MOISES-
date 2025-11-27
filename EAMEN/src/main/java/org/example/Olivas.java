package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Olivas {
    static void main() {
        Scanner tc=new Scanner(System.in);

        int ancho=0;
        int alto=0;

        System.out.println("╔========================╗");
        System.out.println("║ BIENVENIDO A OLIVEMARO ║");
        System.out.println("╚========================╝");

            try {
                System.out.print("ELIGE TU ANCHO: ");
                ancho = Integer.parseInt(tc.nextLine());
                System.out.print("ELIGE TU ALTO: ");
                alto = Integer.parseInt(tc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("SOLO SE ADMITEN NÚMEROS");

            }

        System.out.println("╔==========================================╗");
        System.out.println("║ TU CAMPO SERA DE "+alto+" X "+ancho+"                   ║");
        System.out.println("╚==========================================╝");

        String matriz[][] = new String[alto][ancho];

        String filas_i ;
        String[] columnas_j;

        for (int i = 0; i < alto; i++) {

            System.out.print("Introduce la fila " + (i + 1) + ": ");
            filas_i = tc.nextLine();

            if (filas_i.length() != ancho) {
                System.out.println("ERROR: La línea debe tener exactamente " + ancho + " letras.");
                i--;
                continue;
            }

            columnas_j = filas_i.split("");


            for (int j = 0; j < ancho; j++) {
                matriz[i][j] = columnas_j[j];
            }
        }


        for (String[] tabla:matriz){
            System.out.println(Arrays.toString(tabla));
        }


















    }
}
