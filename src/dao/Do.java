/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author hebod
 */
public class Do {

    public float calcularProm(int n) {
        float i, suma = 0, prom;
        i = 2;
        do {
            suma = suma + i;
            i += 1;

        } while (i < n);
        prom = suma / (n - 2);
        System.out.println(suma);
        System.out.println(i);
        return prom;
    }

    public float calcularProm2(int n, int k) {
        float suma = 0, prom;
        k += 1;
        do {
            suma = suma + k;
            k += 1;

        } while (k < n);
        prom = suma / (n - 2);
        System.out.println(suma);
        System.out.println(k);
        return prom;
    }

    public boolean esComp(int numero) {
        // Casos especiales
        if (numero == 0 || numero == 1) {
            return false;
        }
        int x = 2;
        do {
            if (numero % x == 0) {
                return true;

            }
            x++;
        } while (x < numero / 2);

        return false;
    }

    public int imprimirImpar() {
        int x = 2;
        int suma = 0;
        do {
            if (x % 2 != 0) {
                suma = suma + x;
            }
            x++;

        } while (x < 200);

        return suma;

    }

}
