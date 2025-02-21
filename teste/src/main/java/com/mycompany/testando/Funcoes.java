/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testando;



/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class Funcoes {
    public void Somar(int n1, int n2){
        System.out.println(n1+n2);
    }
    public void baskhara(int a, int b, int c){
        int delta;
        delta = (b*b) + (-4*a*c);
        int[] resultados = new int[2];
        int raizDelta = (int)java.lang.Math.sqrt(delta);
        resultados[0] = ((-b) + raizDelta)/(2*a);
        resultados[1] = ((-b) - raizDelta)/(2*a);
        System.out.println(resultados[0]);
        System.out.println(resultados[1]);
    }
    
}
