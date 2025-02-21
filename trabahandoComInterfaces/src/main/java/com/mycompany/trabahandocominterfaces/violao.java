/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabahandocominterfaces;

/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class violao implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("bleimbleimbleim");
    }

    @Override
    public void afinar() {
         System.out.println(" afinado");
    }
    
    public void trocarCorda(){
                System.out.println("corda trocada");
    }
    
}
