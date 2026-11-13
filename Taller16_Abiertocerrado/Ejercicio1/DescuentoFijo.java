package Taller16_Abiertocerrado.Ejercicio1;

public class DescuentoFijo extends Descuento {
    public DescuentoFijo(double valor) {
        super(valor);
    }

    @Override
    public double calcular(double precio) {
        return valor;
    }
}