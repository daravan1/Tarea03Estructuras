/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Operaciones {

    Scanner entrada;

    public Operaciones() {

        this.entrada = new Scanner(System.in);
    }

    public int menu() {

        System.out.println("Calcular la multiplicación de dos matrices bidimensionales  [1]");
        System.out.println("Calcular la suma de matrices    [2]");
        System.out.println("Calcular la resta de matrices.   [3]");
        System.out.println("Calcular la multiplicación por un escalar    [4]");
        System.out.println("Obtener la traspuesta de una matriz.  [5]");
        System.out.println("Salir:  [0]");
        return entrada.nextInt();
    }

    public void Multiplicacion(int matriz1[][], int matriz2[][]) {

        int filasMatriz1 = matriz1.length;
        int columnasMatriz1 = matriz1[0].length;
        int columnasMatriz2 = matriz2[0].length;

        int[][] resultado = new int[filasMatriz1][columnasMatriz2];

        for (int i = 0; i < filasMatriz1; i++) {
            for (int j = 0; j < columnasMatriz2; j++) {
                for (int k = 0; k < columnasMatriz1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.println(resultado[i][j] + " ");
            }
        }
    }

    public void Suma(int matriz1[][], int matriz2[][]) {

        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] suma = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(suma[i][j] + " ");
            }
        }
    }
    
    public void Resta(int matriz1[][], int matriz2[][]) {
        
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resta = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resta[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(resta[i][j] + " ");
            }
        } 
    }
    
    public void MultiplicacionEscalar (int matriz1[][], int a ){
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] escalar = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                escalar[i][j] = matriz1[i][j] * a;
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(escalar[i][j] + " ");
            }
        } 
    }
    
    public void Transpuesta(int matriz1[][]){
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] transpuesta = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                 transpuesta[j][i] = matriz1[i][j];
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(transpuesta[i][j] + " ");
            }
        } 
    }
}
