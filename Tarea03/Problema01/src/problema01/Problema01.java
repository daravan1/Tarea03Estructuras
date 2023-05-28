/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner escaner = new Scanner(System.in);

        // Leer las dimensiones de la matriz
        System.out.print("Ingrese el número de filas: ");
        int f = escaner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int c = escaner.nextInt();

        int[][] matriz = new int[f][c];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        int[] sumaF = new int[f];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                sumaF[i] = sumaF[i] + matriz[i][j];
            }
        }

        int[] sumaC = new int[c];
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < f; i++) {
                sumaC[j] = sumaC[i] + matriz[i][j];
            }
        }

    }
}
