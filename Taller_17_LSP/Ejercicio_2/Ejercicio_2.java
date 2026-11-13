package Taller_17_LSP.Ejercicio_2;

//1. Define una clase base CuentaBancaria y una clase derivada CuentaAhorros.
//2. Asegúrate de que CuentaAhorros cumpla el LSP sin introducir restricciones inesperadas.

public class Ejercicio_2 {

    //Este metodo solo conoce CuentaBancaria
    public static void operar( CuentaBancaria cuenta ) {

        cuenta.depositar( 500 );
        cuenta.retirar( 300 );
        cuenta.mostrarSaldo();

    }

    public static void main( String[] args ) {

        CuentaBancaria cuenta1 = new CuentaBancaria( 1000 );
        CuentaAhorros ahorros1 = new CuentaAhorros( 2000, 0.05 );

        //La cuenta de ahorros se comporta igual que la cuenta normal
        operar( cuenta1 );
        operar( ahorros1 );

        //Lo extra de CuentaAhorros no afecta lo heredado
        ahorros1.calcularInteres();

    }
}