package Taller_14_Polimorfismo.Ejercicio_2;

public class Estudiante extends Persona {

    private String carrera;

    //super envia el nombre al constructor de Persona
    public Estudiante( String nombre, String carrera ) {

        super( nombre );
        this.carrera = carrera;

    }

    //Sobrescribe el metodo de Persona con un mensaje de estudiante
    @Override
    public void presentarse() {

        System.out.println( "\nHola, soy " + nombre + " y estudio " + carrera + "." );

    }
}
