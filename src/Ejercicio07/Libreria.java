package Ejercicio07;

public class Libreria {

    private String titulo, autor;
    private Integer stock, prestados;
    private Integer auxPrest = 1;
    private Integer auxDev = 1;

    public Libreria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPrestados() {
        return prestados;
    }

    public void setPrestados(Integer prestados) {
        this.prestados = prestados;
    }

    public Integer getAuxPrest() {
        return auxPrest;
    }

    public void setAuxPrest(Integer auxPrest) {
        this.auxPrest = auxPrest;
    }

    public void prestamo() {
        if (stock > 0) {
            System.out.println("Operacion permitida.");
            prestados = prestados - 1;
            stock = stock - prestados;
            System.out.println("Titulo: "+titulo+" ,Stock Final: "+stock);
        }
    }

    public void devolucion() {
        if (stock > 0) {
            System.out.println("Operacion permitida.");
            prestados = prestados + 1;
            stock = stock - prestados;
            System.out.println("Titulo: "+titulo+" ,Stock Final: "+stock);
        }
    }

    @Override
    public String toString() {
        return "Libreria{" + "titulo=" + titulo + ", autor=" + autor + ", stock=" + prestados + '}';
    }
}
