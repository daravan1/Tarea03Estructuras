/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema11;
import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Problema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas y columnas: ");
        int n = scanner.nextInt();
        int matriz[][] = new int[n][n];
        int contador =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = (int) (Math.random()*10 + 1);
                if (!verificarRepetido(matriz, num)) {
                    matriz[i][j] = num;
                    contador++;
                } else {
                    j--; // Retroceder y generar otro número en la misma posición
                }
            }
        }

    }
    
    public static Boolean verificarRepetido(int [][] matriz,int num){
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento == num) {
                    return true;
                }
            }
        }
        return false;
    }
}
