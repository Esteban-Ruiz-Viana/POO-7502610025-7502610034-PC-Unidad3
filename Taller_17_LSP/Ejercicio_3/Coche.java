package Taller_17_LSP.Ejercicio_3;

public class Coche extends Transporte {

    //Sobrescribe sin romper y sigue moviendose
    @Override
    public void mover() {

        System.out.println( "\nEl coche avanza por la carretera." );

    }
}