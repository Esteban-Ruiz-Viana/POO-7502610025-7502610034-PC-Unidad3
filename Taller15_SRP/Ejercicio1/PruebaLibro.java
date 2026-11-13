package Taller15_SRP.Ejercicio1;

public class PruebaLibro {

    public static void main(String[] args) {

        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupery", 35000);

        ReporteLibro reporte = new ReporteLibro();
        GuardarLibro guardar = new GuardarLibro();

        reporte.generarReporte(libro);
        guardar.guardar(libro);
    }
}