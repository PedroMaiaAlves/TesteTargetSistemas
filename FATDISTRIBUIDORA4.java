/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testetecnicotargetsistemas;

/**
 *
 * @author Pedro Henrique
 */
public class FATDISTRIBUIDORA4 {
    public static void main(String[] args) {
        double SP = 67836.43;
        double RJ = 36678.66; //RJ
        double MG = 29229.88; //MG
        double ES = 27165.48; //ES
        double OT = 19849.53; //Outros
        double total = SP + RJ + MG + ES + OT;
        double percentualSp = (SP / total) * 100;
        double percentualRj = (RJ / total) * 100;
        double percentualMg = (MG / total) * 100;
        double percentualEs = (ES / total) * 100;
        double percentualOt = (OT / total) * 100 ;
        
        System.out.println("Total e " + total);
        System.out.println(percentualSp);
        System.out.println(percentualRj);
        System.out.println(percentualMg);
        System.out.println(percentualEs);
        System.out.println(percentualOt);
        
    }
}
