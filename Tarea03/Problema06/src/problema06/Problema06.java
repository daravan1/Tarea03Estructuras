/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema06;

/**
 *
 * @author darav
 */
public class Problema06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones ope = new Operaciones();
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int escalar = 5;
        int op;
        do {
            op = ope.menu();
            switch (op) {
                case 1 ->
                    ope.Multiplicacion(matriz1, matriz2);
                case 2 ->
                    ope.Suma(matriz1, matriz2);
                case 3 ->
                    ope.Resta(matriz1, matriz2);
                case 4 ->
                    ope.MultiplicacionEscalar(matriz1, escalar);
                case 5 ->
                    ope.Transpuesta(matriz1);
                default -> {
                }
            }

        } while (op != 0);
    }
}
