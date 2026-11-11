package Taller_14_Polimorfismo.Ejercicio_1;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    //Constructor con dos parametros
    public Rectangulo( double base, double altura ) {

        this.base = base;
        this.altura = altura;

    }

    //Sobrescribe el metodo de Figura con la formula del rectangulo
    @Override
    public void calcularArea() {

        double area = base * altura;

        System.out.println( "Area del rectangulo: " + area );

    }
}