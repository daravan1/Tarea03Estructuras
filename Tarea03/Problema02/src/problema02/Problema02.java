/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author darav
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] arreglo = {{4, 2, 6}, {1, 8, 15}, {10, 30, 9}, {5, 1, 4}};
        int m = arreglo.length;
        int n = arreglo[0].length;
        int suma = 0;
        int minimo = (m < n) ? m : n;
        for (int i = 0; i < minimo; i++) {
            suma = suma + arreglo[i][n - 1 - i];
        }
        System.out.println("La suma de los elementos de la diagonal invertida es: " + suma);
    }
}
