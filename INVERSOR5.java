/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testetecnicotargetsistemas;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique
 */
public class INVERSOR5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de caracteres:");
        String input = scanner.nextLine(); 

        char[] caracteres = input.toCharArray();
        for (int i=caracteres.length-1; i >= 0; i--){
            System.out.print(caracteres[i]);
     }
    }
}