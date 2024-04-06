/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.igor_q5;

import java.util.Scanner;

/**
 *
 * @author isantos
 */
public class Igor_Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        System.out.println("Cadastro");
        System.out.println("Cadastre sua senha: ");
        int sh = sc.nextInt();
        System.out.println("Login..");
        while ( sh == sh){
            System.out.println("Informe sua senha ");
            int acesso = sc.nextInt();
                if (acesso == sh){
                    System.out.println("Acesso permitido");
                    break;
                } else {
                    System.out.println("Acesso negado");
                } 
        }
    }
}
