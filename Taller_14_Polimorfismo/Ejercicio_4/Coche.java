package Taller_14_Polimorfismo.Ejercicio_4;

public class Coche extends Vehiculo {

    //Sobrescribe el metodo de Vehiculo con un mensaje propio
    @Override
    public void mover() {

        System.out.println( "\nEl coche avanza por la carretera." );

    }
}