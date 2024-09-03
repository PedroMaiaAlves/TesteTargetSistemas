/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testetecnicotargetsistemas;

/**
 *
 * @author Pedro Henrique
 * 1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
 * Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
 * Imprimir(SOMA);
 * Ao final do processamento, qual será o valor da variável SOMA?
 *
 */
public class KSOMA1 {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        
        for(int k = 0; k < indice; k++) {
            soma = soma + k;
        }

        System.out.println(soma);     
    }
}
