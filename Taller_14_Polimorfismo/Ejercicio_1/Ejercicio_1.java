package Taller_14_Polimorfismo.Ejercicio_1;

//1. Define una clase Figura con un método calcularArea que imprima un mensaje general.
//2. Define dos clases derivadas (Circulo y Rectangulo) que sobrescriban calcularArea para
// mostrar sus respectivas áreas.
//3. Crea una clase de prueba que demuestre el uso del polimorfismo al calcular las áreas de diferentes figuras.

public class Ejercicio_1 {

    public static void main( String[] args ) {

        //Polimorfismo: todas las variables son Figura, pero cada objeto es distinto
        Figura figura1 = new Figura();
        Figura figura2 = new Circulo( 5 );
        Figura figura3 = new Rectangulo( 4, 6 );

        //Mismo metodo, tres resultados distintos
        figura1.calcularArea();
        figura2.calcularArea();
        figura3.calcularArea();

    }
}