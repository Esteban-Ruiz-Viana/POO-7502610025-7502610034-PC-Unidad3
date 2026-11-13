package Taller_17_LSP.Ejercicio_1;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo( double base, double altura ) {

        this.base = base;
        this.altura = altura;

    }

    //Cumple el contrato: devuelve un area valida
    @Override
    public double calcularArea() {

        return base * altura;

    }
}