/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Numeros {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        ArrayList <Integer> numeros = new ArrayList();        
        int numero;
        double suma = 0;
        double prom;
        
        do {
            System.out.println("Ingresa un numero.");
            numero = scan.nextInt();
            if( numero != -99){
                suma= suma+numero;
                numeros.add(numero);
            }           
        }while (numero != -99);
        
        for (Integer muestra : numeros){
            System.out.println(muestra);
        }
        
        System.out.println("La cantidad de numeros ingresados es: "+numeros.size());
        System.out.println("La suma es "+suma);
        System.out.println("El promedio es "+suma/numeros.size());
    }
}
