/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema09;

/**
 *
 * @author darav
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = {{8, 2, 3},{4, 10, 6},{1, 2, 9}};
        int n = matriz.length;

        int determinante = 0;

        for (int i = 0; i < n; i++) {
            determinante += matriz[0][i] * cofactor(matriz, 0, i);
        }
        System.out.println("El determinante es: " + determinante);

    }

}
