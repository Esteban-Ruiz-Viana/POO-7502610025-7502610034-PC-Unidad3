package Taller_17_LSP.Ejercicio_2;

public class CuentaBancaria {

    protected double saldo;

    public CuentaBancaria( double saldo ) {

        this.saldo = saldo;

    }

    public void depositar( double monto ) {

        saldo = saldo + monto;

    }

    //Si no alcanza el saldo, avisa y no hace el retiro
    public void retirar( double monto ) {

        if ( monto <= saldo ) {

            saldo = saldo - monto;

        } else {

            System.out.println( "\nSaldo insuficiente." );

        }
    }

    public void mostrarSaldo() {

        System.out.println( "\nSaldo: " + saldo );

    }
}
