/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contatos;

/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class Contato {  
    private String nome;    
    private int numero;    
    
    public Contato(String nome, int numero){
        this.nome =nome;
        this.numero =numero;
    }
    
    public String getDados(){
       return nome + " - " + numero; 
    }            
            
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
}
