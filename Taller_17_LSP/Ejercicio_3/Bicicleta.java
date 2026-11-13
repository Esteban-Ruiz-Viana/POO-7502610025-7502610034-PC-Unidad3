package Taller_17_LSP.Ejercicio_3;

public class Bicicleta extends Transporte {

    //Sobrescribe sin romper y sigue moviendose
    @Override
    public void mover() {

        System.out.println( "\nLa bicicleta avanza con pedaleo." );

    }
}