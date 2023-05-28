/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema14;

/**
 *
 * @author darav
 */
public class Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        String[][] matriz = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = "-";
            }
        }

        for (int i = 0; i < n; i++) {
            int asteriscos = n - 2 * i;
            int inicio = i;

            for (int j = 0; j < asteriscos; j++) {
                matriz[n - 1 - i][inicio + j] = "*";
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
