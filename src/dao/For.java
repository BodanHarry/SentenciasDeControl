/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author hebod
 */
public class For {
    public static boolean primo(int numero){
         if (numero == 0 || numero == 1 || numero == 4) return false;
         for (int x = 2; x < numero / 2; x++) {
         if (numero % x == 0) return false;
                }
        return true; 
    }
}
