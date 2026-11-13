package Taller_17_LSP.Ejercicio_1;

//1. Define una clase base Figura y clases derivadas Circulo y Rectangulo.
//2. Asegúrate de que las clases derivadas cumplan el LSP al calcular su área.

public class Ejercicio_1 {

    //Este metodo solo conoce Figura, no sabe si es Circulo o Rectangulo
    public static void mostrarArea( Figura figura ) {

        System.out.println( "\nArea: " + figura.calcularArea() );

    }

    public static void main( String[] args ) {

        Figura figura1 = new Circulo( 5 );
        Figura figura2 = new Rectangulo( 4, 6 );

        //Las dos hijas sustituyen a Figura sin que el metodo falle
        mostrarArea( figura1 );
        mostrarArea( figura2 );

    }
}