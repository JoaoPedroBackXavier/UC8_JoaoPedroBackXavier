/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaexecoes;

/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class Funcoes {
    public void iro(Exception erro){
        System.out.println("erro: \" " + erro.getMessage() + " \"");  
    } 
    
public void vefage(int idade){
    if (idade < 18){
        throw new IllegalArgumentException("a idade deve ser maior que dzoito");        
    }
}

}


