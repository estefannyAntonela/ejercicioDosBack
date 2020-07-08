/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author esalcedo
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Indica si la palabra ingresada es palindromo: ");
        while (true) {
            System.out.println("\nIngrese una palabra: ");
            Scanner entrada = new Scanner(System.in);
            String palabra = entrada.nextLine();
            if (esPalindromo(palabra)) {
                System.out.println("La palabra [" + palabra + "] SI es un palindromo.");
            } else {
                System.out.println("La palabra [" + palabra + "] NO es un palindromo.");
            }
        }
    }

    private static boolean esPalindromo(String palabra) {
        StringBuilder reves;
        try {
            reves = new StringBuilder();
            for (int i = palabra.length(); i >= 1; i--) {
                reves.append(palabra.charAt(i - 1));
            }
            if (palabra.equalsIgnoreCase(reves.toString())) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
