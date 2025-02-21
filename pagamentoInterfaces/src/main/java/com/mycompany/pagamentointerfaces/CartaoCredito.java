/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagamentointerfaces;

/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class CartaoCredito implements Pagamento{

    
    String numeroCartao;
    int codigoSeguranca;
    CartaoCredito(String numeroCartao, int codigoSeguranca){
        this.numeroCartao =numeroCartao;
        this.codigoSeguranca =codigoSeguranca;
    }
    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + "processado via Cartão de Crédito");
    }

    @Override
    public String obterDetalhes() {
        System.out.println("8340, João Xavier, vencimento 2030" + numeroCartao + codigoSeguranca);
        return null;
    }
    
}
