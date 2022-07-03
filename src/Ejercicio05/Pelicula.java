package Ejercicio05;

import java.util.Comparator;

public class Pelicula {

    private String titulo;
    private String director;
    private Double duracion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo;
    }

    public static Comparator<Pelicula> DuracionMayorMenor = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo        
        public int compare(Pelicula p1, Pelicula p2) { // Le pasamos dos objetos a comparar
            return p2.getDuracion().compareTo(p1.getDuracion()); // Los comparamos usando el get y el compareTo
        }
    };

    public static Comparator<Pelicula> DuracionMenorMayor = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo        
        public int compare(Pelicula p1, Pelicula p2) { // Le pasamos dos objetos a comparar
            return p1.getDuracion().compareTo(p2.getDuracion()); // Los comparamos usando el get y el compareTo
        }
    };
    
     public static Comparator<Pelicula> ordenAlfabeticoTit = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo        
        public int compare(Pelicula p1, Pelicula p2) { // Le pasamos dos objetos a comparar
            return p1.getTitulo().compareTo(p2.getTitulo()); // Los comparamos usando el get y el compareTo
        }
    };
    
    public static Comparator<Pelicula> ordenAlfabeticoDir = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo        
        public int compare(Pelicula p1, Pelicula p2) { // Le pasamos dos objetos a comparar
            return p1.getDirector().compareTo(p2.getDirector()); // Los comparamos usando el get y el compareTo
        }
    };
}
