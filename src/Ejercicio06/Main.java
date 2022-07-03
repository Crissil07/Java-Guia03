package Ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashSet<String> country = new HashSet();
        String rta = "";
        String nombre;

        do {
            System.out.println("Ingrese un pais");
            nombre = scan.next();
            country.add(nombre);

            System.out.println("-------------------------");
            System.out.println("¿Desea agregar otro pais?");
            rta = scan.next();
            System.out.println("-------------------------");
        } while (rta.equalsIgnoreCase("si"));

        System.out.println("Paises:");
        for (String elPais : country) {
            System.out.println(elPais);
        }

//      Orden de paises por alfabeto
        System.out.println("--------------------------");
        ArrayList<String> p2 = new ArrayList(country);
        Collections.sort(p2);

        System.out.println("Paises:");
        for (String elPais : p2) {
            System.out.println(elPais);
        }

        //Pais a eliminar
        System.out.println("--------------------------");
        System.out.println("Ingrese un pais a eliminar.");
        String nom2 = scan.next();

        Iterator<String> elim = p2.iterator();
        while (elim.hasNext()) {
            if (elim.next().equalsIgnoreCase(nom2)) {
                elim.remove();
            }else{
                System.out.println("El nombre no existe");
            }
        }
        System.out.println("--------------------------");
        System.out.println("Paises:");
        for (String elPais : p2) {
            System.out.println(elPais);
        }
    }
}
