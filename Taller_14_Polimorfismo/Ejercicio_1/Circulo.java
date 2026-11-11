package Taller_14_Polimorfismo.Ejercicio_1;

public class Circulo extends Figura {

    private double radio;

    //Constructor: this diferencia el atributo del parametro
    public Circulo( double radio ) {

        this.radio = radio;

    }

    //Sobrescribe el metodo de Figura con la formula del circulo
    @Override
    public void calcularArea() {

        double area = Math.PI * radio * radio;

        System.out.println( "\nArea del circulo: " + area );

    }
}