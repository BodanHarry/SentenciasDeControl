/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author hebod
 */
public class Aritmeticos {
    public String evaluarMultiplo(int num1, int num2){
        if (num1>0 && num1 % num2 ==0) return "El número " + num1 + " es múltiplo de " + num2;
        else return "El número " + num1 + " no es múltiplo de " + num2;
    }
    
    public float calcularPrimeraExpresion(int num3,int num4, int num5, int num6, int num7){
        float operacion = num3 + num4;
        operacion = operacion - num5;
        operacion = operacion * num6;
        operacion =  operacion / num7;
        return operacion;
    }
    
    public float calcularSegundaExpresion(int num8, int num9, int num10, int num11, int num12){
        float operando1 = num8 + num9;
        operando1 = operando1 * num10;
        float operando2 = num11 / num12;
        float total = operando1 - operando2;
        return total;
    }
    
    public int elevar(int num13, int  num14){
        int numeroElevado = (int) Math.pow(num13, num14);
        return numeroElevado;
    }
    
    public float calcularTerceraExpresion(int num15, int num16, int num17){
        float resto1 = (float) Math.pow(num15, num16);
        float resto2 = num16/num17;
        float expresion= resto1*resto2;
        return expresion;
    }
}
