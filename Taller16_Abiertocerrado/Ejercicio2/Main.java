package Taller16_Abiertocerrado.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Documento[] documentos = {
                new Documento("Informe"),
                new DocumentoWord("Carta"),
                new DocumentoExcel("Presupuesto")
        };

        for (Documento documento : documentos) {
            documento.exportar();
        }
    }
}