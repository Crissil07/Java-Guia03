package Ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> pelicula = new ArrayList();
        String rta = "";
        Pelicula peli;

        do {

            peli = new Pelicula();
            System.out.println("Titulo de la pelicula");
            String titu = scan.next();
            peli.setTitulo(titu);
            System.out.println("Nombre del director");
            String dire = scan.next();
            peli.setDirector(dire);
            System.out.println("Duracion de la pelicula");
            double durac = scan.nextDouble();
            peli.setDuracion(durac);

            pelicula.add(peli);

            System.out.println("-----------------------------");
            System.out.println("¿Desea agregar otra pelicula?");
            rta = scan.next();
            System.out.println("-----------------------------");

        } while (rta.equalsIgnoreCase("si"));

        //Imprimo las peliculas
        System.out.println("Lista de peliculas");
        System.out.println("--------------------------");
        for (Pelicula Pelis : pelicula) {
            System.out.println(Pelis);
        }
        //Mayor a 1 hora
        System.out.println("-------------------------");
        System.out.println("Peliculas mayor a 1 hora:");
        System.out.println("--------------------------");
        for (Pelicula Pelis : pelicula) {
            if (Pelis.getDuracion() > 1) {
                System.out.println(Pelis);
            }
        }

        //Comparamos peliculas Duracion mayor a menor
        System.out.println("--------------------------");
        System.out.println("Peliculas en duracion de mayor a menor");
        System.out.println("--------------------------");
        pelicula.sort(Pelicula.DuracionMayorMenor);
        for (Pelicula Pelis : pelicula) {
            System.out.println(Pelis);
        }

        //Comparamos peliculas Duracion menor a menor
        System.out.println("--------------------------");
        System.out.println("Peliculas en duracion de mayor a menor");
        System.out.println("--------------------------");
        pelicula.sort(Pelicula.DuracionMenorMayor);
        for (Pelicula Pelis : pelicula) {
            System.out.println(Pelis);
        }
        
        //Comparamos peliculas orden alfabetico
        System.out.println("--------------------------");
        System.out.println("Peliculas orden alfabetico");
        System.out.println("--------------------------");
        pelicula.sort(Pelicula.ordenAlfabeticoTit);
        for (Pelicula Pelis : pelicula) {
            System.out.println(Pelis);
        }
        
        //Comparamos directores orden alfabetico
        System.out.println("--------------------------");
        System.out.println("Directores orden alfabetico");
        System.out.println("--------------------------");
        pelicula.sort(Pelicula.ordenAlfabeticoDir);
        for (Pelicula Pelis : pelicula) {
            System.out.println(Pelis.getDirector());
        }
    }
}
