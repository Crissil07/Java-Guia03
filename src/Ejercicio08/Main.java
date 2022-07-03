package Ejercicio08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        String rta01 = "";
        String rta02;
        Integer precio;

        HashMap<String, Integer> producto = new HashMap();

        do {
            System.out.println("-------------------------------------");
            System.out.println("Ingrese una opcion:");
            System.out.println("A - Introducir un producto a la lista");
            System.out.println("B - Modificar precio");
            System.out.println("C - Eliminar producto");
            System.out.println("D - Mostrar productos");
            System.out.println("E - Salir");
            rta02 = scan.next();
            System.out.println("-------------------------------------");
            System.out.println("\n");

            switch (rta02) {

                case "a":
                    do {
                        System.out.println("Nombre del producto.");
                        nombre = leer.nextLine();

                        System.out.println("Precio.");
                        precio = scan.nextInt();

                        producto.put(nombre, precio);
                        System.out.println("¿Desea volver a ingresar otro producto?");
                        rta01 = scan.next();

                    } while (rta01.equalsIgnoreCase("si"));
                    break;
                case "b":
                    System.out.println("Poducto a modificar");
                    String nombre02 = scan.next();

                    for (Map.Entry<String, Integer> muestraProd : producto.entrySet()) {
                        if (nombre02.equalsIgnoreCase(muestraProd.getKey())) {
                            System.out.println("Ingresar el precio a modificar");
                            muestraProd.setValue(scan.nextInt());
                        } else {
                            System.out.println("No se encontro el producto.");
                        }
                    }
                    break;
                case "c":
                    System.out.println("¿Que producto desea eliminar?");
                    String nombre03 = leer.next();
                    producto.remove(nombre03);
                    System.out.println("El producto " + nombre03 + " ha sido borrado.");
                    break;
                case "d":
                    for (Map.Entry<String, Integer> muestraProd : producto.entrySet()) {
                        System.out.println("Producto: " + muestraProd.getKey() + " . Precio: " + muestraProd.getValue());
                    }
                    break;
            }
        } while (rta02.equalsIgnoreCase("e"));
    }
}
