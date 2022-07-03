package Ejercicio03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<CantanteFamoso> cantantes = new ArrayList();
        String respuesta = "";
        String op;

        for (int i = 0; i < 5; i++) {

            CantanteFamoso c1 = new CantanteFamoso();
            System.out.println("Ingrese el nombre de un cantante famoso");
            String nombre = scan.next();
            c1.setNombre(nombre);
            System.out.println("Ingrese el disco con mas ventas del artista");
            String dVentas = scan.next();
            c1.setDiscoConMasVentas(dVentas);
            cantantes.add(c1);
            System.out.println("-------------------------");
        }

        for (CantanteFamoso cantante : cantantes) {
            System.out.println("Cantante: " + cantante.getNombre() + " - Disco mas vendido: " + cantante.getDiscoConMasVentas());
        }

        do {
            System.out.println("Elija una opcion");
            System.out.println("-----------------------------");
            System.out.println("A- Ingresar un nuevo cantante");
            System.out.println("B- Ver lista de cantantes");
            System.out.println("C- Eliminar un cantante");
            System.out.println("D- Salir del menu");
            System.out.println("-----------------------------");
            op = scan.next();

            switch (op) {
                case "a":
                    CantanteFamoso c2 = new CantanteFamoso();
                    System.out.println("Nuevo nombre del cantante");
                    String nom2 = scan.next();
                    c2.setNombre(nom2);
                    cantantes.add(c2);
                    break;
                case "b":
                    for (CantanteFamoso cantante : cantantes) {
                        System.out.println(cantante.getNombre());
                    }
                    break;
                case "c":
                    System.out.println("Elimina alguno de los siguientes cantantes:");
                    for (CantanteFamoso cantante : cantantes) {
                        System.out.println(cantante.getNombre());
                    }
                    String nom3 = scan.next();

                    Iterator<CantanteFamoso> elim = cantantes.iterator();
                    while (elim.hasNext()) {
                        if (elim.next().getNombre().equalsIgnoreCase(nom3)) {
                            elim.remove();
                        }
                    }
                    break;
                case "d":
                    break;
            }
        } while (op != "d");

        for (CantanteFamoso cantante : cantantes) {
            System.out.println("Cantante: " + cantante.getNombre() + " - Disco mas vendido: " + cantante.getDiscoConMasVentas());
        }
    }
}
