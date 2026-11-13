package Taller16_Abiertocerrado.Ejercicio1;

public class Tienda {
    public double precioFinal(double precio, Descuento descuento) {
        return precio - descuento.calcular(precio);
    }
}
