/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagamentointerfaces;

/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class Paypal implements Pagamento{

    String email;
    
        Paypal(String email){
        this.email =email;}

    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado via PayPal");
    }

    @Override
    public String obterDetalhes() {
        System.out.println("email: " + email);
        return null;

    }
    

}


