/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.igor_q2;

import java.util.Scanner;

/**
 *
 * @author isantos
 */
public class Igor_Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe quantos anos você tem: ");
        int anos = sc.nextInt();
        System.out.println("Informe quantos meses: ");
        int meses = sc.nextInt();
        System.out.println("Informe quantos dias: ");
        int dias = sc.nextInt();
        
        int resultado = (anos * 360) + meses + dias;
        System.out.println("Você tem " + anos + " anos " + meses + " meses e " + dias + " dias  = " + resultado + " dias");
    }
}
