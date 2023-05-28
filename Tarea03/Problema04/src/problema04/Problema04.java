/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;


/**
 *
 * @author darav
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matriz = new int[20][5];
        int[] coeficientes = {1, 2, 3, 4, 5};

        //Calcular la media de cada alunmo
        double[] mediasAlumnos = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            int creditos = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma = suma + (matriz[i][j] * coeficientes[j]);
                creditos = creditos + coeficientes[j];
            }
            mediasAlumnos[i] = (double) suma / creditos;
        }
        
        //Calcular la media de todas las asignaturas
        double[] mediasAsignaturas = new double[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            int creditos = 0;

            for (int i = 0; i < matriz.length; i++) {
                suma = suma + (matriz[i][j] * coeficientes[j]);
                creditos = creditos + coeficientes[j];
            }
            mediasAsignaturas[j] = (double) suma / creditos;
        }
        //Calcular el porcentaje de faltas
        int faltas = 0;
        int examenesTotal = matriz.length * matriz[0].length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    faltas++;
                }
            }
        }

        double porcentaje =  (faltas * 100) / examenesTotal;

    }
}
