/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author hebod
 */
public class Arreglo2 {
     public static int[][] sd(int[][] matriz, int k){
        int[][] arrayFinal = new int[matriz.length][matriz[0].length];
        
        for (int i = 0; i <=  arrayFinal.length; i++){
            for(int j = 0; j < arrayFinal[i].length; j++){
                arrayFinal[i][j] = k * matriz[i][j];
                  
            }
           
        }
        return arrayFinal;
    }
}
