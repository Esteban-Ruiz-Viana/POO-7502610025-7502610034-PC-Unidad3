package Taller15_SRP.Ejercicio3;

public class ServicioAutenticacion {

    public void autenticar(Usuario usuario, String contraseña) {

        if (usuario.getContraseña().equals(contraseña)) {

            System.out.println("Inicio de sesion exitoso.");

        } else {

            System.out.println("Contraseña incorrecta.");
        }
    }
}