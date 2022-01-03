/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] promedio = new double[3];
        double suma;
        double prom;
        String reporte = "";

        for (int fila = 0; fila < notas.length; fila++) {
            suma = 0;
            for (int col = 0; col < notas[fila].length; col++) {
                suma = suma + notas[fila][col];

            }

            prom = suma / notas[fila].length;
            promedio[fila] = prom;
        }
        for (int i = 0; i < estudiantes.length; i++) {
            reporte = String.format("%sEstudiante: %s tiene un promedio de "
                    + ": %.2f\n",
                    reporte,
                    estudiantes[i],
                    promedio[i]);
        }

        System.out.printf("%s\n", reporte);
    }

}
