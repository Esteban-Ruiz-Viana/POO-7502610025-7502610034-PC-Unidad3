package Taller_14_Polimorfismo.Ejercicio_3;

public class Moto extends Vehiculo {

    //Mala practica: sobrescribe el metodo pero no cambia nada.
    //Compila bien, pero es codigo que no aporta.
    @Override
    public void mover() {

        super.mover();

    }
}