package Taller15_SRP.Ejercicio1;

public class ReporteLibro {

    public void generarReporte(Libro libro) {

        System.out.println("REPORTE DEL LIBRO");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Precio: $" + libro.getPrecio());
    }
}