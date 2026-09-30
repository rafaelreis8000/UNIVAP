package Impressora;
public class LaserPrinter implements Impressora {

    public LaserPrinter() {
    }

    @Override
    public String imprimir(String documento) {
        return "Imprimindo \"" + documento + "\" utilizando uma impressora laser.";
    }
}