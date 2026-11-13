package Taller_17_LSP.Ejercicio_2;

public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteres;

    //super envia el saldo al constructor de CuentaBancaria
    public CuentaAhorros( double saldo, double tasaInteres ) {

        super( saldo );
        this.tasaInteres = tasaInteres;

    }

    //Agrega algo nuevo, pero NO cambia depositar ni retirar.
    //Asi no introduce restricciones que la clase base no tenia.
    public void calcularInteres() {

        System.out.println( "\nInteres ganado: " + ( saldo * tasaInteres ) );

    }
}
