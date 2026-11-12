package Taller_14_Polimorfismo.Ejercicio_3;

//1. Intenta invocar un método que exista solo en una clase derivada utilizando una referencia de
// la clase base y observa el error de compilación.
//2. Crea una clase derivada que sobrescriba un método pero que no modifique realmente el comportamiento
// del método de la clase base, y discute por qué esto es una mala práctica.

public class Ejercicio_3 {

    public static void main( String[] args ) {

        //Error de compilacion
        //La variable es Animal, pero el objeto es un Perro
        Animal animal1 = new Perro();

        //Este metodo si existe en Animal
        animal1.hacerSonido();

        //ERROR: correr() solo existe en Perro, no en Animal.
        //animal1.correr();

        //Mala practica sin error
        Vehiculo moto1 = new Moto();

        //Imprime lo mismo que Vehiculo, la sobrescritura no cambio nada
        moto1.mover();

    }
}