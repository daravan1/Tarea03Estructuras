/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Scanner;
/**
 *
 * @author darav
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        // TODO code application logic here
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

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    sumaPares += matriz[i][j];
                } else {
                    sumaImpares += matriz[i][j];
                }
            }
        }

        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("La suma de los numeros impares es: " + sumaImpares);
    }
}
