package Taller_17_LSP.Ejercicio_3;

//1. Define una clase Transporte y crea clases derivadas Bicicleta y Coche.
//2. Verifica que ambas clases derivadas puedan sustituir a Transporte sin alterar la funcionalidad del programa.

public class Ejercicio_3 {

    public static void main( String[] args ) {

        //Objeto normal de Transporte
        Transporte transporte1 = new Transporte();

        //La variable es Transporte, pero el objeto es una hija
        Transporte transporte2 = new Bicicleta();
        Transporte transporte3 = new Coche();

        //Se llama igual en los tres y el programa no falla
        transporte1.mover();
        transporte2.mover();
        transporte3.mover();

    }
}