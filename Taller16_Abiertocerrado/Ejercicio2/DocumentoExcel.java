package Taller16_Abiertocerrado.Ejercicio2;

public class DocumentoExcel extends Documento {
    public DocumentoExcel(String titulo) {
        super(titulo);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando " + titulo + " a Excel");
    }
}
