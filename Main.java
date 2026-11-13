
public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                "Sebastian",
                "sebastian@gmail.com",
                "123456"
        );

        ValidadorUsuario validador = new ValidadorUsuario();
        ServicioAutenticacion autenticacion = new ServicioAutenticacion();

        if (validador.validar(usuario)) {

            System.out.println("Datos del usuario validos.");

            autenticacion.autenticar(usuario, "123456");

        } else {

            System.out.println("Los datos del usuario no son validos.");
        }
    }
}