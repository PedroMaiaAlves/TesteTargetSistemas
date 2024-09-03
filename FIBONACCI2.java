/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testetecnicotargetsistemas;

/**
 *
 * @author Pedro Henrique
 * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

   IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
 */
public class FIBONACCI2 {
  
    public static int FIBO(int n){
        if(n == 0 || n == 1){
            return n;
        } else{
          return FIBO(n-1)+FIBO(n-2);
        }
    }
    
    public static void main(String[] args) {
        // j = a entrada;
        int i = 0;
        int j = 22;
        int pertence = 0;
        while(FIBO(i) <= j){
            if(FIBO(i) == j) {
                pertence = 1;
                break;
            }
          i++;  
        } 
        if(pertence==1){
            System.err.println(j + " Pertence a sequencia");
        } else {
            System.out.println(j + " Nao pertence");
        }
    }
}

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34

//1  2  3  4  5  6  7  8  9
