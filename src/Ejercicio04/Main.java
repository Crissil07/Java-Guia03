package Ejercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Alumno> alumno = new ArrayList();
        String rta = "";
        Alumno a1;

        do {
            a1 = new Alumno();
            System.out.println("Ingrese el nombre del alumno.");
            String nombre = scan.next();
            a1.setNombre(nombre);
            ArrayList<Integer> notas = new ArrayList();

            System.out.println("Ingrese la nota A.");
            int notaA = scan.nextInt();
            System.out.println("Ingrese la nota B.");
            int notaB = scan.nextInt();
            System.out.println("Ingrese la nota C.");
            int notaC = scan.nextInt();

            alumno.add(a1);
            notas.add(notaA);
            notas.add(notaB);
            notas.add(notaC);
            a1.setNotas(notas);

            System.out.println("-------------------");
            System.out.println("¿Desea agregar otro alumno?");
            rta = scan.next();
            System.out.println("-------------------");

        } while (rta.equalsIgnoreCase("si"));

        for (Alumno alum : alumno) {
            System.out.println(alum);
        }

        System.out.println("Ingrese el nombre del alumno a buscar.");
        String buscAlum = scan.next();

        for (Alumno alum : alumno) {
            if (alum.getNombre().equalsIgnoreCase(buscAlum)) {
                System.out.println("Se ha encontrado el nombre");
                alum.notaFinal();
                break;
            }
        }
    }
}
