/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg01;

import java.util.Scanner;

/**
 *
 * @author Enrique Pretel
 */
public class Grados {
    public static void main (String[] args){
        Scanner grados = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Introduce los grados Celcius");
        gradosC = grados.nextDouble();
        gradosF = (gradosC * 9/5) + 32;
        System.out.println( gradosC + " grados Celcius es igual a " + gradosF + " grados Farenheit");
    }
}