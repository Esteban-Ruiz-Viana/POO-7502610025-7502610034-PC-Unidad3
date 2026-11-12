package Taller_14_Polimorfismo.Ejercicio_4;

public class Bicicleta extends Vehiculo {

    //Sobrescribe el metodo de Vehiculo con un mensaje propio
    @Override
    public void mover() {

        System.out.println( "\nLa bicicleta avanza con pedaleo." );

    }
}