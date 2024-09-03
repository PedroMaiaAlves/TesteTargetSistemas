/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testetecnicotargetsistemas;

import java.util.Scanner;
/**
 *
 * @author Pedro Henrique
 * 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
 */
public class FATURAMENTO3 {
    // vetor que itera 30 vezes
    // que armazena os valores em double 
    public static void main(String[] args) {
        double maiorValor = 0;
        double menorValor = 0;
        double soma = 0;
        double media = 0;
        int diaAcima = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        double[] faturamento = new double[5]; 
        
       for(int i=0; i < faturamento.length; i++){
           System.out.println("Digite o valor do faturamento");
           faturamento[i] = scanner.nextDouble();
           
           soma = soma + faturamento[i];
           
           if (faturamento[i] < menorValor) {
                menorValor = faturamento[i];
            }
           if (faturamento[i] > maiorValor) {
                maiorValor = faturamento[i];
            }
       } media = soma / faturamento.length;
       
       for(int i = 0; i < faturamento.length; i++){
           if(faturamento[i]>media){
           diaAcima++;
        }
       }
        
        System.out.println("O menor valor foi: " + menorValor);
        System.out.println("O maior valor foi: " + maiorValor);
        System.out.println("A media e " + media);
        System.out.println("Numero de dias acima da media: "+ diaAcima);
    }
}