/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        double[][] ventas = new double[2][5];
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        double suma = 0;
        double valor;
        String reporte = "";

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.printf("Ingrese su venta por día\n%s\t:",
                        dias[j]);
                valor = entrada.nextDouble();
                ventas[i][j] = valor;
                suma = suma + valor;
            }
            System.out.println(); // salto de línea

        }
        for (int i = 0; i < vendedores.length; i++) {
            reporte = String.format("%sVendedor(a) %s \n",
                    reporte,
                    vendedores[i]);
        }

        System.out.printf("%sHa realizado un total de $%.2f en ventas.",
                 reporte, suma);
    }
}
