package Impressora;
public class InkjetPrinter implements Impressora {

    public InkjetPrinter() {
    }

    @Override
    public String imprimir(String documento) {
        return "Imprimindo \"" + documento + "\" utilizando uma impressora jato de tinta.";
    }
}