package Ejercicio04;

import java.util.ArrayList;

public class Alumno {

    public String nombre;
    public ArrayList<Integer> notas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Nombre=> " + nombre + " : notas: " + notas;
    }

    public void notaFinal() {
        Integer suma = 0;
        for (Integer nota : notas) {
            suma = suma + nota;
        }
        Double promedio = (double) suma / 3;
        System.out.println("Nota final: " + promedio);
    }
}
