package Taller_14_Polimorfismo.Ejercicio_2;

public class Profesor extends Persona {

    private String materia;

    public Profesor( String nombre, String materia ) {

        super( nombre );
        this.materia = materia;

    }

    //Sobrescribe el metodo de Persona con un mensaje de profesor
    @Override
    public void presentarse() {

        System.out.println( "\nBuenas, soy el profesor " + nombre + " y enseño " + materia + "." );

    }
}
