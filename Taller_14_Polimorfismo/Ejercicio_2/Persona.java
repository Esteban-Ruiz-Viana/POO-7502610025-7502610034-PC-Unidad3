package Taller_14_Polimorfismo.Ejercicio_2;

public class Persona {

    protected String nombre;

    public Persona( String nombre ) {

        this.nombre = nombre;

    }

    //Metodo ( mensaje general )
    public void presentarse() {

        System.out.println( "\nHola, soy " + nombre + "." );

    }
}