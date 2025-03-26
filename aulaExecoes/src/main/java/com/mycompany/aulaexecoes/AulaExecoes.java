/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulaexecoes;

import java.io.FileReader;

/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class AulaExecoes { 
    

    
    public static void main(String[] args) {
   
        Funcoes funcoes = new Funcoes();
        
        try{FileReader arquivo = new FileReader("arquivo.txt");}
        catch(Exception error){funcoes.iro(error);}
        
        try{funcoes.vefage(20);}
        catch(Exception error){funcoes.iro(error);}
        
        

    
    
    
    }}
