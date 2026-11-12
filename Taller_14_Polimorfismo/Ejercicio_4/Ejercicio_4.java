package Taller_14_Polimorfismo.Ejercicio_4;

//1. Define una clase Vehículo con un método mover que imprima un mensaje general.
//2. Define dos clases derivadas (Coche y Bicicleta) que sobrescriban mover para mostrar mensajes específicos.
//3. Crea una clase de prueba donde se utilice una referencia de Vehículo para invocar
// los métodos de los objetos Coche y Bicicleta.

public class Ejercicio_4 {

    public static void main( String[] args ) {

        //Polimorfismo: la variable es Vehiculo, pero los objetos son Coche y Bicicleta
        Vehiculo vehiculo1 = new Coche();
        Vehiculo vehiculo2 = new Bicicleta();

        vehiculo1.mover();
        vehiculo2.mover();

    }
}
