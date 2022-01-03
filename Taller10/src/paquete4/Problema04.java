/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        double[][] datos = new double[2][2];
        double valor;
        System.out.println("Ingreso de datos al arreglo");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\t:",
                        i, j);
                valor = entrada.nextDouble();
                datos[i][j] = valor;
            }
            System.out.println(); // salto de línea
        }
        System.out.println("Presentación de valores del arreglo");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%.2f\t", datos[i][j]);
            }
            System.out.println(); // salto de línea
        }
    }
}
