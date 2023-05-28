/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema10;

/**
 *
 * @author darav
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = {{8, 2, 3},{4, 10, 6},{1, 2, 9}};
        int n = matriz.length;
        int[][] matrizTranspuesta = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizTranspuesta[i][j] = matriz[n - j - 1][n - i - 1];
            }
        }
    }
    
}
