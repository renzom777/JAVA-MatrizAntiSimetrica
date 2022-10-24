/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.matrizantisimetrica;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JAVAMatrizAntiSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz=new int [3][3];
        int [][] matrizT=new int [3][3];
        System.out.println("Ingrese los elementos de la matriz 3x3, uno a uno");
        Comparar(Rellenar(matriz),RellenarTransp(matriz,matrizT));
    }
    
    public static int[][] Rellenar(int[][]matriz){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=leer.nextInt();
            }
        }
        return matriz;
    }
    public static int[][] RellenarTransp(int[][]matriz, int[][]matrizT) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j]=matriz[j][i];
            }
        }
        return matrizT;
    }
    public static void Comparar(int[][] matriz, int[][] matrizT) {
        boolean bandera=true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j]!=-1*matrizT[i][j]){
                    bandera=false;
                    break;
                } 
            }
        }
            if (bandera) {
                System.out.println("La matriz es anti-simétrica");
            } else {
                System.out.println("La matriz no es anti-simétrica");
            }
    }
    
}
