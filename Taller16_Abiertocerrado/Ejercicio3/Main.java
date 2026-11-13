package Taller16_Abiertocerrado.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();

        notificador.notificar(new Mensajero(), "Su pedido fue confirmado");
        notificador.notificar(new MensajeroSMS(), "Su pedido va en camino");
        notificador.notificar(new MensajeroPush(), "Su pedido fue entregado");
    }
}
