package Ejercicio07;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        HashSet<Libreria> libro = new HashSet();
        Libreria Libro;
        String rta = "";
        int cont = 0;

        do {
            Libro = new Libreria();
            System.out.println("Titulo del libro.");
            String nom = scan.next();
            Libro.setTitulo(nom);
            System.out.println("Autor del libro.");
            String autor = scan.next();
            Libro.setAutor(autor);
            System.out.println("Ingrese el stock del libro");
            int stock = scan.nextInt();
            Libro.setStock(stock);
            System.out.println("Ejemplares prestados.");
            int prestados = scan.nextInt();
            Libro.setPrestados(prestados);
            libro.add(Libro);

            System.out.println("---------------------------");
            System.out.println("¿Desea ingresar otro libro?");
            rta = scan.next();
            System.out.println("---------------------------");
        } while (rta.equalsIgnoreCase("si"));

        System.out.println("Que operacion desea realizar:");
        System.out.println("A - Prestamo");
        System.out.println("B - Devolucion");
        String rta2 = scan.next();
        switch (rta2) {
            case "a":
                System.out.println("Ingrese el libro a prestar.");
                String nom2 = scan.next();

                for (Libreria listLibro : libro) {
                    if (listLibro.getTitulo().equalsIgnoreCase(nom2)) {
                        listLibro.prestamo();
                    }
                }
                break;
            case "b":
                System.out.println("Ingrese el libro a devolver");
                String nom3 = scan.next();

                for (Libreria listLibro : libro) {
                    if (listLibro.getTitulo().equalsIgnoreCase(nom3)) {
                        listLibro.devolucion();
                    }
                }
                break;
        }

        System.out.println("------------------------------------");
        for (Libreria listLibro : libro) {
            System.out.println(listLibro);
        }
    }
}
