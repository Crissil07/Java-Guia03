/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> libro = new ArrayList();

        String titulo;
        String titulo2;
        String respuesta = "";

        do {
            System.out.println("Ingrese el titulo del libro que desea.");
            titulo = scan.next();

            libro.add(titulo);

            System.out.println("Ingrese una respuesta:");
            System.out.println("A- ¿Quiere ingresar otro titulo?");
            System.out.println("B- ¿Desea salir");

            respuesta = scan.next();
        } while (respuesta.equalsIgnoreCase("a"));

        for (String muestra : libro) {
            System.out.println("Titulo: " + muestra);
        }

        System.out.println("Ingrese un libro a buscar en la lista");
        titulo2 = scan.next();

        Iterator<String> ite = libro.iterator();

        while (ite.hasNext()) {
            if (ite.next().equalsIgnoreCase(titulo2)) {
                ite.remove();
                System.out.println("El libro " + titulo2 + " ha sido eliminado.");
            } else {
                System.out.println("El libro no esta en la lista.");
            }
        }

        for (String muestra : libro) {
            System.out.println("Titulo: " + muestra);
        }
    }
}
