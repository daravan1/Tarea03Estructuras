/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema12;

/**
 *
 * @author darav
 */
public class Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = 9;
        String[][] matriz = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = "-";
            }
        }
        for (int i = 0; i < n; i++) {
            matriz[i][0] = "*";
            matriz[i][n - 1] = "*";
            matriz[0][i] = "*";
            matriz[n - 1][i] = "*";
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
