/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

/**
 *
 * @author darav
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = {
            {6, 3, 0},
            {2, 57, 1},
            {40, 8, 61}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas - 1; j++) {
                for (int k = 0; k < columnas - j - 1; k++) {
                    if (matriz[i][k] > matriz[i][k + 1]) {
                        int temp = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp;
                    }
                }
            }
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
