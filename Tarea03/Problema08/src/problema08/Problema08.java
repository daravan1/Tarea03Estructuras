/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema08;

import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Problema08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas y columnas: ");
        int n = scanner.nextInt();

        int[][] cuadradoMagico = new int[n][n];

        int fila = n - 1;
        int columna = n / 2;
        int valor = 1;

        while (valor <= n * n) {
            cuadradoMagico[fila][columna] = valor;

            fila++;
            columna++;

            if (fila == n && columna == n) {
                fila = 0;
                columna = 0;
            } else if (fila == n) {
                fila = 0;
            } else if (columna == n) {
                columna = 0;
            }

            if (cuadradoMagico[fila][columna] != 0) {
                fila--;
                columna--;
                if (fila < 0) {
                    fila = n - 1;
                }
                if (columna < 0) {
                    columna = n - 1;
                }
            }

            valor++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cuadradoMagico[i][j]);
            }
            System.out.println();
        }
    }

}
