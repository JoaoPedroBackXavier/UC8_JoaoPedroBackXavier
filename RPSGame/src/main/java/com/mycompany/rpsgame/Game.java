/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;
import java.util.Scanner;
/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class Game {
    Validator validador = new Validator();
    Scanner sc = new Scanner(System.in);
    
    Player jogador = new Player();
    Player maquina = new Player();
    
    int i = 0;
    String escolha = "";
    
    public void Start(){   
        while(i < 3){ 
            System.out.println("escolha pedra(1), papel(2), tesoura(3)") ;
            jogador.ultimaEscolha = sc.nextInt();
            
            switch(jogador.ultimaEscolha){
                case 1:
                    escolha = "pedra";
                    break;
                case 2:
                    escolha = "papel";
                    break;
                case 3:
                    escolha = "tesoura"; 
                    break;
            }
            
            System.out.println("voce escolheu " + escolha);
            maquina.ultimaEscolha = (int) (Math.random() * 3)+1;
            
            switch(maquina.ultimaEscolha){
                case 1:
                    escolha = "pedra";
                    break;
                case 2:
                    escolha = "papel";
                    break;
                case 3:
                    escolha = "tesoura"; 
                    break;
            }
            
            System.out.println("ele escolheu " + escolha);
    
            switch(validador.validateRound(jogador.ultimaEscolha, maquina.ultimaEscolha)){
                case 1:
                    jogador.vitorias += 1; 
                    maquina.perdas +=1;
                    System.out.println("voce ganhou o round") ;
                    break;
                case 0: 
                    jogador.empates += 1;
                    maquina.empates +=1;
                    System.out.println("voce empatou nesse round") ;
                    break;
                case -1: 
                    jogador.perdas += 1;
                    maquina.vitorias +=1;
                    System.out.println("voce perdeu o round") ;
                    break;
            }        
        i ++;
        }  
        switch(validador.validateMatch(jogador.vitorias, maquina.vitorias)){
            case  1: 
                System.out.println("voce ganhou a partida") ;
                break;
            case  0: 
                System.out.println("voce empatou nessa partida") ;
                break;
            case -1: 
                System.out.println("voce perdeu a partida");
                break;
        }
    }    
}
