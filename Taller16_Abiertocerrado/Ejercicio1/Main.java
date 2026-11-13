package Taller16_Abiertocerrado.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Descuento porcentual = new Descuento(10);
        Descuento fijo = new DescuentoFijo(15000);

        System.out.println("Precio con descuento porcentual: " + tienda.precioFinal(100000, porcentual));
        System.out.println("Precio con descuento fijo: " + tienda.precioFinal(100000, fijo));
    }
}