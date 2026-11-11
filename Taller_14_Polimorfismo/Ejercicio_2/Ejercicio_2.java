package Taller_14_Polimorfismo.Ejercicio_2;

//1. Define una clase Persona con un método presentarse que imprima un mensaje general.
//2. Define dos clases derivadas (Estudiante y Profesor) que sobrescriban presentarse para mostrar mensajes específicos.
//3. Crea una clase de prueba donde instancies objetos de Persona, Estudiante y Profesor, y uses
// polimorfismo para invocar presentarse.

public class Ejercicio_2 {

    public static void main( String[] args ) {

        //Objeto normal de Persona
        Persona persona1 = new Persona( "Mariana" );

        //Polimorfismo: la variable es Persona, pero los objetos son hijos
        Persona persona2 = new Estudiante( "Esteban", "Ingenieria de Software" );
        Persona persona3 = new Profesor( "Jhon", "POO" );

        persona1.presentarse();
        persona2.presentarse();
        persona3.presentarse();

    }
}