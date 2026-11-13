package Taller_17_LSP.Ejercicio_1;

public class Circulo extends Figura {

    private double radio;

    public Circulo( double radio ) {

        this.radio = radio;

    }

    //Cumple el contrato: devuelve un area valida
    @Override
    public double calcularArea() {

        return Math.PI * radio * radio;

    }
}
