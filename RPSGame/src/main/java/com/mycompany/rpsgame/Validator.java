/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;

/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class Validator {
    public int validateRound(int playerChoice, int computerChoice){
        if(playerChoice == computerChoice){
            return 0;
            
        }else if((playerChoice == 1) && (computerChoice == 3) ||
                 (playerChoice == 2) && (computerChoice == 1) ||
                 (playerChoice == 3) && (computerChoice == 2) ){
        return 1;
        }else{
        return -1;
        }
        
    }
    
    public int validateMatch(int playerWins, int computerWins){
        if(playerWins > computerWins){
            return 1;
        }else if(playerWins == computerWins){
            return 0;
        }else{
            return -1;
        }
    }
}
