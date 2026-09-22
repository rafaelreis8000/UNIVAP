public class PortaNor extends PortaOr {

    public PortaNor() {
        super();
        nor();
    }

    public PortaNor(String a, String b) {
        super(a, b);
        nor();
    }

    public PortaNor(Porta a, Porta b) {
        super(a, b);
        nor();
    }

    public PortaNor(int a, int b) {
        super(a, b);
        nor();
    }

    public PortaNor(boolean a, boolean b) {
        super(a, b);
        nor();
    }

    public PortaNor nor() {
        getSaida().setEstado(
            !(getA().getEstado() || getB().getEstado())
        );

        return this;
    }

    @Override
    public PortaNor or() {
        nor();
        return this;
    }

    @Override
    public String toString() {
        return "{\"a\":\"" + getA().getEstadoInt()
             + "\",\"b\":\"" + getB().getEstadoInt()
             + "\",\"saida\":\"" + getSaida().getEstadoInt()
             + "\"}";
    }
}