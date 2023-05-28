/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author darav
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double almacenes[][] = new double[10][3];

        //Calcular la media de las ventas mensuales
        double mediaM[] = new double[10];
        for (int i = 0; i < almacenes.length; i++) {
            double suma = 0;
            for (int j = 0; j < almacenes[i].length; j++) {
                suma = suma + almacenes[i][j];
            }
            mediaM[i] = suma / 3;
        }

        //Lista de almacenes por encima de la media
        double mediaTotal = 0;
        for (int i = 0; i < mediaM.length; i++) {
            mediaTotal = mediaTotal + mediaM[i];
        }
        mediaTotal = mediaTotal / 10;
        List<Integer> indiceMayorMedia = new ArrayList<>();
        for (int i = 0; i < mediaM.length; i++) {
            if (mediaM[i] >= mediaTotal) {
                indiceMayorMedia.add(i);
            }
        }

        //Encontrar mes mas pructivo y el mes menos productivo
        double [] totalMeses = new double[3];
        
        for (int i = 0; i < almacenes[0].length; i++) {
            for (int j = 0; j < almacenes.length; j++) {
                totalMeses[i] = totalMeses[i] + almacenes[i][j];
            }
        }
        //Mes mas pructivo
        int indiceMayor = 0;
        double mayorValor = totalMeses[0];
        for (int i = 0; i < totalMeses.length; i++) {
            if (totalMeses[i] > mayorValor) {
                mayorValor = totalMeses[i];
                indiceMayor = i+1;
            }
        }
        System.out.println("El mes mas productivo fue el numero: " + indiceMayor);
        
        //Mes menos productivo
         int indiceMenor = 0;
        double menorValor = totalMeses[0];
        for (int i = 0; i < totalMeses.length; i++) {
            if (totalMeses[i] > menorValor) {
                menorValor = totalMeses[i];
                indiceMenor = i+1;
            }
        }
        System.out.println("El mes menos productivo fue el numero: " + indiceMenor);
    }

}
