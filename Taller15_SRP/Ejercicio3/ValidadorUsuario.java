package Taller15_SRP.Ejercicio3;

public class ValidadorUsuario {

    public boolean validar(Usuario usuario) {

        if (usuario.getCorreo().contains("@") &&
                usuario.getContraseña().length() >= 6) {

            return true;
        }

        return false;
    }
}