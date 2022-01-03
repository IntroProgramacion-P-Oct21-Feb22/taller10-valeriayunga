/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String mensaje ="";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                
                 String valor = estudiantes[i][j];
                 int longitud=valor.length();
                 
                 if (longitud==11)
                     mensaje = String.format("%s%s\n"
                             ,mensaje,estudiantes[i][j]);
                 
            }
        }
        System.out.printf("%s",mensaje);
    }
}
