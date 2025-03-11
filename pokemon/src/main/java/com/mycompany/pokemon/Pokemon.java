/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemon;

/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class Pokemon {
    private String name;
    private String tipo;
    private int level;
    String getInfo;
    
    Pokemon(String name, String tipo, int level){
        this.name=name;
        this.tipo = tipo;
        this.level=level;
    }
    
    String getName(){
        return name;
    }
    String getTipo(){
        return tipo;
    }
    int getLevel(){
        return level;
    }
    String getInfo(){
        return ("nome: "+name+" tipo: "+tipo+" level: "+ level);
    }
    
}
